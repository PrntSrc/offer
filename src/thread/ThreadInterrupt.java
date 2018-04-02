package thread;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class ThreadInterrupt implements Runnable {

    @Override
    public void run() {
        while (true) {
//            System.out.println(Thread.interrupted());
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadInterrupt tt = new ThreadInterrupt();
        Thread thread = new Thread(tt);
        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }
}
