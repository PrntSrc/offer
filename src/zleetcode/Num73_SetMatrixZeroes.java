package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-04
 */
public class Num73_SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean frow = false, fcol = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) frow = true;
                    if (j == 0) fcol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }
        if (frow)
            for (int j = 0; j < col; j++) matrix[0][j] = 0;
        if (fcol)
            for (int i = 0; i < row; i++) matrix[i][0] = 0;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};

        setZeroes(matrix);

        for (int[] m : matrix)
            System.out.println(Arrays.toString(m));
    }
}
