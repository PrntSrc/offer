package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-22
 */
public class Num43_MultiplyStrings {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length() - 1, len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0) {
//            while ()
        }
        return "";
    }

    public static void main(String[] args) {
        String num1 = "27", num2 = "32";
        System.out.println(multiply(num1, num2));
        System.out.println(('2' - '0') * ('2' - '0'));
    }
}
