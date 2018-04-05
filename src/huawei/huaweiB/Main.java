package huawei.huaweiB;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-03
 */
public class Main {

    public static String getIPv6Type(String ip) {
        if (!isValidIPv6(ip)) return "Error";
        if (ip.substring(0, 2).toUpperCase().equals("FF")) return "Multicast";
        if (ip.substring(0, 2).toUpperCase().equals("FE")) {
            String t = ip.substring(2, 3);
            if (t.equals("8") || t.equals("9") || t.toUpperCase().equals("A") || t.toUpperCase().equals("B"))
                return "LinkLocal";
            if (t.toUpperCase().equals("C") || t.toUpperCase().equals("D") || t.toUpperCase().equals("E") || t.toUpperCase().equals("F"))
                return "SiteLocal";
        }
        if (ip.equals("0000:0000:0000:0000:0000:0000:0000:0000")) return "Unspecified";
        if (ip.equals("0000:0000:0000:0000:0000:0000:0000:0001")) return "Loopback";
        return "GlobalUnicast";
    }

    private static boolean isValidIPv6(String ip) {
        if(ip.length() < 16) return false;
        if(ip.charAt(0) == ':') return false;
        if(ip.charAt(ip.length() - 1) == ':') return false;
        String[] tokens = ip.split(":");
        if(tokens.length != 8) return false;
        for(String token: tokens) {
            if(!isValidIPv6Token(token)) return false;
        }
        return true;
    }
    private static boolean isValidIPv6Token(String token) {
        if(token.length() > 4 || token.length() == 0) return false;
        char[] chars = token.toCharArray();
        for(char c:chars) {
            boolean isDigit = c >= 48 && c <= 57;
            boolean isUppercaseAF = c >= 65 && c <= 70;
            boolean isLowerCaseAF = c >= 97 && c <= 102;
            if(!(isDigit || isUppercaseAF || isLowerCaseAF))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        System.out.println(getIPv6Type(ip));
    }
}
