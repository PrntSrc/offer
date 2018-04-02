import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Yue
 * @since 2018/3/26
 */

class Base {
    public Base() {func();}
    public void func() {
        System.out.println("Base.Func");
    }
}

class Sub extends Base {
    public Sub() {func();}
    public void func() {
        System.out.println("Sub.Func");
    }
}
public class Test {

//    int count;
//    public int count() {
//        count++;
//        return count;
//    }
    static int foo() {
        int i = 10;
        try {
            i = --i / 0;
            return i--;
        } catch (Exception e) {
            i = i-- / 0;
            return --i;
        } finally {
            --i;
            return i--;
        }
    }
    public static void main(String[] args) {

//        Map<> map = new HashMap()
        System.out.println(foo());

//        System.out.println(new Test().count);
//        new Test().count;
    }
}
