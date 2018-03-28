import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue
 * @since 2018/3/26
 */
public class Test {

    int count;
    public int count() {
        count++;
        return count;
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.count();
        System.out.println(test.count());
//        System.out.println(new Test().count);
//        new Test().count;
    }
}
