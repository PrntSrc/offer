package aoffer;

/**
 * todo https://www.nowcoder.com/questionTerminal/bd7f978302044eee894445e244c7eee6
 * @author Yue Lin
 * @since 2018-03-25
 */
public class Num43_NumOfOne {

    public static int getNumOfOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j > 0) {
                if (j % 10 == 1) count++;
                j /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(getNumOfOne(n));
    }
}
