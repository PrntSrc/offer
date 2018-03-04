import zbook.StackQueue;
import zleetcode.LongestPalindromicSubstring;
import zleetcode.MaximumProductSubarray;
import zleetcode.NextPermutation;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yue
 * @since 2018/1/20
 */
public class Main {

    private static CountDownLatch latch = new CountDownLatch(1);
    private static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

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
        MaximumProductSubarray mps = new MaximumProductSubarray();
        int[] nums = new int[] {-2,0,-1};
        System.out.println(mps.maxProduct(nums));
//        AtomicInteger
    }
}
