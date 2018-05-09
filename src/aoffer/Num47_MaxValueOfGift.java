package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-23
 */
public class Num47_MaxValueOfGift {

//    public static int getMaxValue(int[][] board) {
//        return getMaxValueHelper(board, 0, 0, 0);
//    }
//
//    private static int getMaxValueHelper(int[][] board, int sum, int x, int y) {
//        if (x > board.length - 1 || y > board[0].length - 1) return sum;
//        if (x == board.length - 1 && y == board[0].length - 1) return sum + board[x][y];
//        sum += board[x][y];
//        return Math.max(getMaxValueHelper(board, sum, x, y + 1), getMaxValueHelper(board, sum, x + 1, y));
//    }
    public static int getMaxValue(int[][] board) {
        int row = board.length, col = board[0].length;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + board[i - 1][j - 1];
            }
        }
        return dp[row][col];
    }

    private static int review(int[][] board) {
        return 0;
    }

    public static void main(String[] args) {
        int[][] board = new int[][] {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}
        };
        System.out.println(getMaxValue(board));
    }
}
