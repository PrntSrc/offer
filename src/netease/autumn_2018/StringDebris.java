package netease.autumn_2018;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-20
 */
public class StringDebris {

    public static String getMeanOfDebrisSum(String s) {
        int debrisNum = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                debrisNum++;
        }

        BigDecimal bd = new BigDecimal(s.length() * 1.0 / debrisNum);
        return bd.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getMeanOfDebrisSum(s));
    }
}
