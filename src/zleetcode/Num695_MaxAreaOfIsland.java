package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-04
 */
public class Num695_MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    max = Math.max(dfs(grid, i, j), max);
            }
        }
        return max;
    }

    private static int dfs(int[][] grid, int x, int y) {
        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
            grid[x][y] = 0;
            return 1 + dfs(grid, x - 1, y) +  dfs(grid, x + 1, y) +
                    dfs(grid, x, y - 1) + dfs(grid, x, y + 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
