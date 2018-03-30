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

    int count;
    public int count() {
        count++;
        return count;
    }
    public static void main(String[] args) {
//        Test test = new Test();
//        test.count();
//        System.out.println(test.count());
        Base base = new Sub();
        base.func();
//        System.out.println(new Test().count);
//        new Test().count;
    }
}
