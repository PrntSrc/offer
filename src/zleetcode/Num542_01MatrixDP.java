//package zleetcode;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//
///**
// * @author Yue Lin
// * @since 2018-05-31
// */
//public class Num542_01MatrixDP {
//
//    static class Coordinate {
//        private int x;
//        private int y;
//        public Coordinate(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    public static int[][] updateMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] != 0)
//                    matrix[i][j] = bfs(matrix, i, j);
//            }
//        }
//        return matrix;
//    }
//
//    private static int bfs(int[][] matrix, int a, int b) {
//        int dis = 0;
//        boolean[][] marked = new boolean[matrix.length][matrix[0].length];
//        Queue<Coordinate> queue = new LinkedList<>();
//        queue.offer(new Coordinate(a, b));
//        marked[a][b] = true;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Coordinate coordinate = queue.poll();
//                int x = coordinate.x;
//                int y = coordinate.y;
//                marked[x][y] = true;
//                if (matrix[x][y] == 0) return dis;
//                if (x > 0 && !marked[x - 1][y]) queue.offer(new Coordinate(x - 1, y));
//                if (x < matrix.length - 1 && !marked[x + 1][y]) queue.offer(new Coordinate(x + 1, y));
//                if (y > 0 && !marked[x][y - 1]) queue.offer(new Coordinate(x, y - 1));
//                if (y < matrix[0].length - 1 && !marked[x][y + 1]) queue.offer(new Coordinate(x, y + 1));
//            }
//            dis++;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        int[][] matrix = new int[][] {
//                {0, 0, 0},
//                {0, 1, 0},
//                {1, 1, 1}};
//        int[][] distance = updateMatrix(matrix);
//        for (int[] dis : distance)
//            System.out.println(Arrays.toString(dis));
//    }
//}
