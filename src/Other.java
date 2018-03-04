import java.util.concurrent.CountDownLatch;

/**
 * @author Yue
 * @since 2018/3/2
 */
public class Other implements Runnable {

    @Override
    public void run() {
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Other o = new Other();
        Thread thread = new Thread(o);
        thread.start();
    }
}
