package ctrip.ctripB;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-29
 */
public class Main {

    public static void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
        String[] ss = s.split("\\s+");
//        System.out.println(Arrays.toString(ss));
//        sc.next();
        int n = ss.length;
//        System.out.println(n);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < ss.length; i++) {
            matrix[0][i] = Integer.valueOf(ss[i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        rotate(matrix);
        for (int[] m : matrix)
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i]);
                if (i != m.length - 1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
    }
}
