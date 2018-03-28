package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-18
 */
public class Num5_ReplaceSpace {

    public static String replaceSpace(String s) {
        return s == null ? s : s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        String s = "hello    hello";
        System.out.println(replaceSpace(s));
    }
}