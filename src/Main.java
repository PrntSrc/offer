import sun.nio.ch.ThreadPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.SimpleFormatter;


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
        ExecutorService es = Executors.newCachedThreadPool();
        System.out.println((char)('a' - 32));
        System.out.println((1 << 1) + 1);

//        ArrayList
//        Semaphore
//        ExecutorService es = Executors.newCachedThreadPool()
//        HashMap = ;
//                String
//        SynchronousQueue
//        hashtable.contains()
    }
}
