package tencent.summer_2017;

import java.util.Scanner;

/**
 * 算法基础-字符移位
 * @author Yue
 * @since 2018/1/28
 */
public class CharacterShift {

    public static String shiftCharacter(String s) {
        char[] c = s.toCharArray();
        int upperIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] >= 'a') {
                for (int j = i; j > upperIndex; j--) {
                    char temp = c[j];
                    c[j] = c[j - 1];
                    c[j - 1] = temp;
                }
                upperIndex++;
            }
        }
        return String.copyValueOf(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            System.out.println(shiftCharacter(sc.nextLine()));
    }
}
