package alibaba.alibabaA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/5/11
 */
public class Main {

    static class Node {
        int time;
        int dir;
        public Node(int time, int dir) {
            this.time = time;
            this.dir = dir;
        }
    }

    public static int getMinTime(int startX, int startY, int startDir, int endX, int endY, int endDir, int r, int c, int[][] map) {
        Node[][] dp = new Node[r + 1][c + 1];
        dp[startX + 1][startY + 1] = new Node(0, startDir);
        for (int i = startX - 1; i <= r; i++) dp[i][0] = new Node(65535, 0);
        for (int i = startY - 1; i <= c; i++) dp[0][i] = new Node(65535, 0);
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (map[i - 1][j - 1] == 1) dp[i][j] = new Node(65535, 0);
                else {
                    int tempDir = dp[i][j - 1].time >= dp[i - 1][j].time ? dp[i][j - 1].dir : dp[i - 1][j].dir;
                    dp[i][j].time = Math.min(dp[i][j - 1].time, dp[i - 1][j].time) + 1;
                    dp[i][j].dir = tempDir;
                }
            }
        }
        int resTime = dp[endX + 1][endY + 1].time;
        int resDir = dp[endX + 1][endY + 1].dir;
        if (resTime ==  65535) return 65535;
        else if (resDir == endDir) return resTime;
        else return resTime + 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        String startDir = sc.next();
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        String endDir = sc.next();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] map = new int[r][c];
        Map<String, Integer> dir = new HashMap<>();
        dir.put("EAST", 1);
        dir.put("WEST", -1);
        dir.put("SOUTH", 2);
        dir.put("NORTH", -2);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                map[i][j] = sc.nextInt();
        }
        System.out.println(getMinTime(startX, startY, dir.get(startDir), endX, endY, dir.get(endDir), r, c, map));
    }
}
