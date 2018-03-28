package netease.autumn_2018;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-03-18
 */
public class MagicCoin {

    private static Stack<String> stack = new Stack<>();

    public static void getNCoins(int n) {
        getNCoinsHelper(n, 0, "");
    }

    private static void getNCoinsHelper(int n, int coins, String sb) {
        if (coins == n) System.out.println(sb);
        if (coins <= n) getNCoinsHelper(n, (coins << 1) + 1, sb + "1");
        if (coins <= n) getNCoinsHelper(n, (coins << 1) + 2, sb + "2");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getNCoins(n);
    }

}
