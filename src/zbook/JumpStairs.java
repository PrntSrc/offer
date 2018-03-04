package zbook;

/**
 * 青蛙跳台阶 一次可以跳1步或者2步
 * @author Yue
 * @since 2018/3/4
 */
public class JumpStairs {

    public static int countJumpMethods(int stairNum) {
        if (stairNum <= 2) return stairNum;
        int pre = 1, cur = 2, temp;
        while (stairNum-- > 2) {
            temp = cur;
            cur += pre;
            pre = temp;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(countJumpMethods(10));
    }
}
