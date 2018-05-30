package didi.autumn_2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-29
 */
public class UndergroundMaze {

    public static void canEscape(int n, int m, int p, int[][] maze) {
        List<String> res = new ArrayList<>();
        res = dfs(n, m, p, maze, 0, 0, res, new boolean[n][m]);
        if (res == null)
            System.out.println("Can not escape!");
        else {
            for (int i = 0; i < res.size(); i++) {
                if (i != res.size() - 1)
                    System.out.print(res.get(i) + ",");
                else
                    System.out.print(res.get(i));
            }
        }

    }

    private static List<String> dfs(int n, int m, int p, int[][] maze, int x, int y, List<String> res, boolean[][] marked) {
        res.add("[" + x + "," + y + "]");
        marked[x][y] = true;
        if (x == 0 && y == m - 1 && p >= 0) return res;
        if (x == n || y == m || p < 0) return null;
        if (x < n - 1 && !marked[x + 1][y] && maze[x + 1][y] == 1)
            x++;
        else if (x > 0 && !marked[x - 1][y] && maze[x - 1][y] == 1) {
            x--;
            p -= 3;
        } else if (y < m - 1 && !marked[x][y + 1] && maze[x][y + 1] == 1) {
            y++;
            p -= 1;
        }
        return dfs(n, m, p, maze, x, y, res, marked);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                maze[i][j] = sc.nextInt();
        }
        canEscape(n, m, p, maze);
    }
}
