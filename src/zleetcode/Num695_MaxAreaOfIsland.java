package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-04
 */
public class Num695_MaxAreaOfIsland {

    private static int max;

    public static int maxAreaOfIsland(int[][] grid) {
        dfs(grid, 0, 0, grid[0][0] == 1 ? 1 : 0);
        return max;
    }

    private static void dfs(int[][] grid, int x, int y, int count) {
        max = Math.max(max, count);
        if (x == grid.length - 1 && y == grid[0].length - 1) return;
        if (x < grid.length - 1 && y < grid[0].length - 1) {
            if (grid[x + 1][y] == 0 && grid[x][y + 1] == 0) {
                dfs(grid, x + 1, y, 0);
                dfs(grid, x, y + 1, 0);
            }
            if (grid[x][y + 1] != 0) dfs(grid, x, y + 1, count + 1);
            if (grid[x + 1][y] != 0) dfs(grid, x + 1, y, count + 1);
        }
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
