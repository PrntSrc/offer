package jingdong.jingdongC;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-04-09
 */
public class Main {

    public static void isVaildByOneMove(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int left = -1;
        int countL = 0, countR = 0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='(')  {
                countL++;
                stack.push(j);
            }
            else {
                countR++;
                if (stack.isEmpty()) left=j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,j-left);
                    else max=Math.max(max,j-stack.peek());
                }
            }
        }
        if (max == s.length()) System.out.println("Yes");
        else if (max + 4 >= s.length() && countL == countR) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < t; i++)
            isVaildByOneMove(sc.nextLine());

    }
}
