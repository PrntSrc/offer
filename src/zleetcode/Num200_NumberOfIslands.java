package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-05
 */
public class Num200_NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    countIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void countIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        countIsland(grid, i - 1, j);
        countIsland(grid, i + 1, j);
        countIsland(grid, i, j - 1);
        countIsland(grid, i, j + 1);
    }

    public static void main(String[] args) {
        char[][] grid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(grid));
    }
}
