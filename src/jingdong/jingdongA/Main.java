package jingdong.jingdongA;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-09
 */
public class Main {

    public static int getWays(String s) {
        if (s.length() == 1) return 0;
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i) - 'A']++;
        int way = 0;
        for (int i = 0; i < 26; i++) {
            if (letters[i] > 0) {
                way++;
            }
        }
        return way;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getWays(s));
    }
}
