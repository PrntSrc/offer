import java.util.Vector;

/**
 * @author Yue Lin
 * @since 2018-04-09
 */
public class TestC {

    static int a;
    int b;
    static int c;

    public int methodA() {
        a++;
        return a;
    }

    public int methodB() {
        b++;
        return b;
    }

    public static int methodC() {
        c++;
        return c;
    }

    public static void main(String[] args) {
        TestC a = new TestC();
        a.methodA();
        System.out.println(a.methodA());
        TestC b = new TestC();
        b.methodB();
        System.out.println(b.methodB());
        TestC c = new TestC();
        System.out.println(TestC.c);
        c.methodC();
        System.out.println(c.methodC());
        String s = "d";
    }
}
