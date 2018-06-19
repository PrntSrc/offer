package zleetcode;

/**
 * @author Yue
 * @since 2018/6/18
 */
public class Num79_WordSearch {

    public static boolean exist(char[][] board, String word) {
        boolean[][] marked = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, 0, i, j, marked))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int v, int x, int y, boolean[][] marked) {
        if (v == word.length()) return true;
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        if (board[x][y] != word.charAt(v) || marked[x][y]) return false;
        marked[x][y] = true;
        boolean exist = dfs(board, word, v + 1, x - 1, y, marked) ||
                dfs(board, word, v + 1, x + 1, y, marked) ||
                dfs(board, word, v + 1, x, y - 1, marked) ||
                dfs(board, word, v + 1, x, y + 1, marked);
        marked[x][y] = false;
        return exist;
    }

    public static void main(String[] args) {

        char[][] board = new char[][] {
                {'A', 'B'}};

        String word = "BA";

        System.out.println(exist(board, word));
    }
}
