import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yue Lin
 * @since 2018-04-12
 */
public class TestE {

    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = a + b;
        String d = "AB";
        String e = new String("AB");
        // todo false
        System.out.println(c == d);
        // todo false
        System.out.println(c == e);
        // todo false
        System.out.println(d == e);
        Long f = 500L;
        Long g = f;
        f++;
        // todo 501
        System.out.println(f);
        // todo 500
        System.out.println(g);
        String h = "ab";
        String i = "a" + "b";
        // todo true
        System.out.println(h == i);
        String k = "aaa";
        String l = "aaa";
        // todo true
        System.out.println(k == l);
    }
}
