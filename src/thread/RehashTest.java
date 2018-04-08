package thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yue Lin
 * @since 2018-04-06
 */
public class RehashTest {

    private static Map<Integer, String> map = new HashMap<>(2, 0.75f);

    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(Thread.currentThread().getName() + " " + entry.getKey() + " " + entry.getValue());
    }

    public static void main(String[] args) {
        map.put(1, "a");

        new Thread("Thread-1") {
            @Override
            public void run() {
                map.put(2, "b");
                printMap(map);
            }
        }.start();

        new Thread("Thread-2") {
            @Override
            public void run() {
                map.put(3, "c");
                printMap(map);
            }
        }.start();

        new Thread("Thread-3") {
            @Override
            public void run() {
                map.put(4, "d");
                printMap(map);
            }
        }.start();

        new Thread("Thread-4") {
            @Override
            public void run() {
                map.put(5, "e");
                printMap(map);
            }
        }.start();
    }

}
