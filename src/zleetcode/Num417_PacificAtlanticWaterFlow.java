package zleetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-30
 */
public class Num417_PacificAtlanticWaterFlow {

    public static List<int[]> pacificAtlantic(int[][] matrix) {
        return null;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 4, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<int[]> res = pacificAtlantic(matrix);
        for (int[] r : res)
            System.out.println(Arrays.toString(r));
    }
}
