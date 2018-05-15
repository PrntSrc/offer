package netease.spring_2019;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-15
 */
public class GetLost {

    public static char findDirection(int n, String turns) {
        char[] direction = new char[] {'N', 'S', 'W', 'E'};
        int preDir = 0;
        for (int i = 0; i < n; i++)
            preDir = nextDirection(preDir, turns.charAt(i));
        return direction[preDir];
    }

    private static int nextDirection(int preDir, char turn) {
        if (preDir == 0) return turn == 'L' ? 2 : 3;
        else if (preDir == 1) return turn == 'L' ? 3 : 2;
        else if (preDir == 2) return turn == 'L' ? 1 : 0;
        else return turn == 'L' ? 0 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String turns = sc.next();
        System.out.println(findDirection(n, turns));
    }
}
