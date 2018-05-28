package microsoft;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @author Yue Lin
 * @since 2018-05-14
 */
public class LFUCache {

    private Map<Integer, Integer> values;
    private Map<Integer, Integer> counts;
    private Map<Integer, LinkedHashSet<Integer>> map;
    private int capacity;
    private int min;

    public LFUCache(int capacity) {
        values = new HashMap<>();
        counts = new HashMap<>();
        map = new HashMap<>();
        map.put(1, new LinkedHashSet<>());
        this.capacity = capacity;
        min = 0;
    }

    public int get(int key) {
        if (!values.containsKey(key))
            return -1;
        int count = counts.get(key);
        counts.put(key, count + 1);
        map.get(count).remove(key);
        if (count == min && map.get(count).size() == 0)
            min++;
        if (!map.containsKey(count + 1))
            map.put(count + 1, new LinkedHashSet<>());
        map.get(count + 1).add(key);
        return values.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;
        if (values.containsKey(key)) {
            values.put(key, value);
            get(key);
            return;
        }
        if (values.size() >= capacity) {
            int toDel = map.get(min).iterator().next();
            map.get(min).remove(toDel);
            values.remove(toDel);
            counts.remove(toDel);
        }
        values.put(key, value);
        counts.put(key, 1);
        min = 1;
        map.get(min).add(key);
    }
}
