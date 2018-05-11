package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-05-11
 */
public class Num135_Candy {

    public static int candy(int[] ratings) {
        int len = ratings.length;
        if (len <= 1) return len;
        int[] candy = new int[len];
        int sum = 0;
//        for (int i = 0; i < len; i++) candy[i] = 1;
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;
        }
        for (int i = len - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i])
                candy[i - 1] = Math.max(candy[i] + 1, candy[i - 1]);
        }
        for (int i = 0; i < len; i++) sum += candy[i];
        return sum + len;
    }

    public static void main(String[] args) {
        int[] ratings = new int[] {3, 2, 3};
        System.out.println(candy(ratings));
    }
}
