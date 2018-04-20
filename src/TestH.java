import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yue Lin
 * @since 2018-04-14
 */
public class TestH {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.get(1);
        String s1 = "3";
        String s2 = "30";
        System.out.println(s2.compareTo(s1));
    }
}
