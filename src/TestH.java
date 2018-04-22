import java.util.ArrayList;
import java.util.List;
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
        List<Integer> res = new ArrayList<>();
        res.add(3);
        res.add(3);
        res.remove((Object)3);
        System.out.println(res.size());
    }
}
