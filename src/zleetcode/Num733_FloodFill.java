package zleetcode;

import java.util.Arrays;

/**
 * @author Yue Lin
 * @since 2018-05-05
 */
public class Num733_FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int raw, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != raw)
            return;
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, raw, newColor);
        fill(image, sr + 1, sc, raw, newColor);
        fill(image, sr, sc - 1, raw, newColor);
        fill(image, sr, sc + 1, raw, newColor);
    }

    public static void main(String[] args) {
        int[][] image = new int[][] {
                {0, 0, 0},
                {0, 1, 1}};
        int sr = 1, sc = 1, newColor = 1;

        image = floodFill(image, sr, sc, newColor);

        for (int[] i : image)
            System.out.println(Arrays.toString(i));
    }
}
