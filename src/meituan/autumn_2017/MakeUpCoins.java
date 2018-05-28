package meituan.autumn_2017;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yue
 * @since 2018/3/10
 */
public class MakeUpCoins {

    private static int count;

    public static int getWaysToN(int n) {
        int[] coins = new int[] {1, 5, 10, 20, 50, 100};
        makeUp(coins, 0, n, 0);
        System.out.println(count);
        return test(coins, n);
//        return count;
    }

    private static void makeUp(int[] coins, int index, int n, int sum) {
        if (sum > n) return;
        if (sum == n) {
            count++;
            return;
        }
        for (int i = index; i < coins.length; i++) {
            sum += coins[i];
            makeUp(coins, i, n, sum);
            sum -= coins[i];
        }
    }

    private static int test(int[] coins, int n) {
        int c = 0, sum = coins[0];
        Queue<Integer> queue = new LinkedList<>();
        for (int coin : coins) {
            while (sum < n) {
                sum += coin;
                queue.offer(coin);
            }
            if (sum == n) c++;
            while (sum > n) sum -= queue.poll();
            if (sum == n) {
                c++;
                sum -= queue.poll();
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getWaysToN(n));
    }

}
