package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Yue Lin
 * @since 2018-03-29
 */
public class ReentrantAndCondition implements Runnable {

    private static ReentrantLock reentrantLock = new ReentrantLock();
    private static Condition condition = reentrantLock.newCondition();
    private static volatile int i = 0;

    @Override
    public void run() {
//        try {
//            reentrantLock.lock();
//            System.out.println("thread wait.");
//            condition.await();
//            System.out.println("thread is going on.");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            reentrantLock.unlock();
//        }
        try {
//            reentrantLock.lock();
            Thread.sleep(100);
            i = Thread.activeCount();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            reentrantLock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantAndCondition rac = new ReentrantAndCondition();
        Thread[] threads = new Thread[200];
        for (int i = 0; i < 200; i++)
            threads[i] = new Thread(rac);
        for (Thread t : threads)
            t.start();
//        Thread thread1 = new Thread(rac);
//        Thread thread2 = new Thread(rac);
//        System.out.println("thread start.");
//        thread1.start();
//        thread2.start();
//        Thread.sleep(2000);
//        reentrantLock.lock();
//        condition.signal();
//        reentrantLock.unlock();
    }
}
