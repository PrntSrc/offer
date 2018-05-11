package netease.spring_2019;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-10
 */
public class StreetLamp {

//    public static int minLampNum(char[] street) {
//        int len = street.length, count = 0;
//        int[] dp1 = new int[len];
//        int[] dp2 = new int[len];
//        dp1[0] = street[0] == '.' ? 1 : 0;
//        dp2[len - 1] = street[len - 1] == '.' ? 1 : 0;
//        for (int i = 1; i < len; i++) {
//            if (dp1[i - 1] == 0 && street[i] == '.')
//                dp1[i] = 1;
//            if (dp2[len - i] == 0 && street[len - 1 - i] == '.')
//                dp2[len - 1 - i] = 1;
//        }
//        for (int i = 0; i < len; i++) {
//            if (dp1[i] == 1 && dp2[i] == 1) count++;
//            else if (dp1[i] == 1) count++;
//            else if (dp2[i] == 1) count++;
//        }
//        return (count + 1) / 2;
//    }

    public static int minLampNum(char[] street) {
        int count = 0, i = 0;
        while (i < street.length && street[i] == 'X') i++;
        for (; i < street.length; i += 3) {
            if (street[i] == '.' ||
                    ((i + 1) < street.length && street[i + 1] == '.') ||
                    ((i + 2) < street.length && street[i + 2] == '.'))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            char[] street = sc.next().toCharArray();
            System.out.println(minLampNum(street));
        }
    }
}
