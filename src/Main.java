import zleetcode.Num542_01Matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author Yue
 * @since 2018/1/20
 */
public class Main {

    private static CountDownLatch latch = new CountDownLatch(1);
//    private static ExecutorService executorService = new ThreadPoolExecutor();//Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    private static void fun() {
        StringBuilder sb = new StringBuilder();
        sb.toString().replace("", "%20");
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(stack);

        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i++ < 10000) {
            System.out.println(i);
        }
        latch.countDown();
    }

    public static int uniquePaths(int m, int n) {
        return countPaths(m, n, 0);
    }

    private static int countPaths(int m, int n, int count) {
        if (m == 1 && n == 1) return count + 1;
        else if (m < 1 || n < 1) return count;
        count = countPaths(m - 1, n, count);
        count = countPaths(m, n - 1, count);
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService es = Executors.newCachedThreadPool();
//        System.out.println((char)('a' - 32));
//        System.out.println((1 << 1) + 1);
//        System.out.println();
//        Integer i = new Double(Math.pow(2, 3)).intValue();
        System.out.println(Math.pow(2, 32) / 8 );
//        System.out.println(Math.pow(-1, 1));
    }
}
