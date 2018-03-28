package thread.model;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author Yue Lin
 * @since 2018-03-17
 */
public class Consumer implements Runnable {

    private BlockingQueue<Data> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingQueue<Data> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start consumer id = " + Thread.currentThread().getId());
        Random r = new Random();

        try {
            while (true) {
                Data data = queue.take();
                if (data != null) {
                    int square = data.getValue() * data.getValue();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", data.getValue(), data.getValue(), square));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
