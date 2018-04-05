package huawei.developer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class HexToDecimal {

    public static long toDecimal(String s, Map<Character, Integer> hex) {
        if (s.length() <= 2) return 0;
        s = s.substring(2);
        int len = s.length();
        long dec = 0;
        int i = 0;
        while (len-- > 0) {
            dec += hex.get(Character.toUpperCase(s.charAt(i++))) * Math.pow(16, len);
        }
        return dec;
    }

    public static void main(String[] args) {
        char[] hex = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < hex.length; i++)
            map.put(hex[i], i);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(toDecimal(s, map));
        }

    }
}
