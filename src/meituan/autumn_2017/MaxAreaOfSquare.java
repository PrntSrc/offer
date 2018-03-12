package meituan.autumn_2017;

import java.util.Scanner;
import java.util.Stack;

/**
 * 未完成
 * @author Yue
 * @since 2018/3/11
 */
public class MaxAreaOfSquare {

    public static int getMaxArea(int[] h) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < h.length; i++) {
            if (stack.empty() || h[i] >= h[stack.peek()])
                stack.push(i);
            else {
                int left = stack.pop();
                int right = i;
                int heigh = h[left];
                maxArea = Math.max(maxArea, (right - left) * heigh);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        System.out.println(getMaxArea(h));
    }
}
