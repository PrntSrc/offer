package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-19
 */
public class Num12_PathInMatrix {

    private static boolean hasPath(String path, char[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        if (path == null || rows < 1 || cols < 1 || matrix == null)
            return false;
        boolean[][] visited = new boolean[rows][cols];
        int pathLen = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathCore(path, matrix, row, col, pathLen, visited))
                    return true;
            }
        }
        return false;
    }

    private static boolean hasPathCore(String path, char[][] matrix, int row, int col, int pathLen, boolean[][] visited) {
        if (pathLen == path.length()) return true;
        int rows = matrix.length, cols = matrix[0].length;
        boolean hasPath = false;
        if (row >= 0 && row < rows &&
                col >= 0 && col < cols &&
                matrix[row][col] == path.indexOf(pathLen) && !visited[row][col]) {
            pathLen++;
            visited[row][col] = true;
            hasPath = hasPathCore(path, matrix, row, col - 1, pathLen, visited) ||
                    hasPathCore(path, matrix, row, col + 1, pathLen, visited) ||
                    hasPathCore(path, matrix, row - 1, col, pathLen, visited) ||
                    hasPathCore(path, matrix, row + 1, col, pathLen, visited);
            if (!hasPath) {
                pathLen--;
                visited[row][col] = false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[][] {
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}};

        String path = "bfce";
        System.out.println(hasPath(path, matrix));
    }
}
