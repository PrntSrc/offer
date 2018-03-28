package toutiao.toutiaoD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Main {

    private static char[][] zero = new char[][] {
            {'6','6','6','6','6'}, {'6','.','.','.','6'}, {'6','.','.','.','6'}, {'6','.','.','.','6'}, {'6','.','.','.','6'}};
    private static char[][] one = new char[][] {
            {'.','.','.','.','6'}, {'.','.','.','.','6'}, {'.','.','.','.','6'}, {'.','.','.','.','6'}, {'.','.','.','.','6'}};
    private static char[][] two = new char[][] {
            {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'6','6','6','6','6'}, {'6','.','.','.','.'}, {'6','6','6','6','6'}};
    private static char[][] three = new char[][] {
            {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'6','6','6','6','6'}};
    private static char[][] four = new char[][] {
            {'6','.','.','.','6'}, {'6','.','.','.','6'}, {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'.','.','.','.','6'}};
    private static char[][] five = new char[][] {
            {'6','6','6','6','6'}, {'6','.','.','.','.'}, {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'6','6','6','6','6'}};
    private static char[][] six = new char[][] {
            {'6','6','6','6','6'}, {'6','.','.','.','.'}, {'6','6','6','6','6'}, {'6','.','.','.','6'}, {'6','6','6','6','6'}};
    private static char[][] seven = new char[][] {
            {'6','6','6','6','6'}, {'.','.','.','6','.'}, {'.','.','6','.','.'}, {'.','6','.','.','.'}, {'6','.','.','.','.'}};
    private static char[][] eight = new char[][] {
            {'6','6','6','6','6'}, {'6','.','.','.','6'}, {'6','6','6','6','6'}, {'6','.','.','.','6'}, {'6','6','6','6','6'}};
    private static char[][] night = new char[][] {
            {'6','6','6','6','6'}, {'6','.','.','.','6'}, {'6','6','6','6','6'}, {'.','.','.','.','6'}, {'6','6','6','6','6'}};
    private static char[][] split = new char[][] {
            {'.','.'},{'.','.'},{'.','.'},{'.','.'},{'.','.'}};

    public static void main(String[] args) {
        List<char[][]> nums = new ArrayList<>();
        nums.add(zero);
        nums.add(one);
        nums.add(two);
        nums.add(three);
        nums.add(four);
        nums.add(five);
        nums.add(six);
        nums.add(seven);
        nums.add(eight);
        nums.add(night);
        nums.add(split);
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int j = 0;
            while (s.charAt(j++) == '6')
            if (s.charAt(j) == '+') flag = 0;
            else if (s.charAt(j) == '-') flag = 1;
            else flag = 2;
            long s1 = Long.valueOf(s.substring(0, j));
            long s2 = Long.valueOf(s.substring(j + 1, s.length()));
            Long res;
            if (flag == 0) {
                res = s1 + s2;
            } else if (flag == 1)
                res = s1 - s2;
            else res = s1 * s2;
            int ls = String.valueOf(res).length();
            Long index = 0l;
            int temp = 10;
            for (int k = 1; k < ls; k++)
                temp *= 10;
            while (res > 0) {
                index =  res / temp;
                System.out.println(nums.get(index.intValue()));
            }
        }
    }
}
