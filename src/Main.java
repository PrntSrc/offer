import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Yue
 * @since 2018/1/20
 */
public class Main {

    private static CountDownLatch latch = new CountDownLatch(1);
//    private static ExecutorService executorService = new ThreadPoolExecutor();//Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    private static void fun() {
        int i = 0;
        while (i++ < 10000) {
            System.out.println(i);
        }
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {

    }
}
