import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

/**
 * @author Yue
 * @since 2018/3/2
 */
public class Other {

    static class ThreadTest implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        ThreadTest threadTest = new ThreadTest();
        for (int i = 0; i < 10; i++)
            es.execute(threadTest);
        es.shutdown();

        LockSupport.park();
    }

}
