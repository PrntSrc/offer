package zleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-27
 */
public class Num841_KeysAndRooms {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] marked = new boolean[rooms.size()];
        dfs(rooms, marked, 0);
        boolean res = true;
        for (boolean m : marked) res &= m;
        return res;
    }

    private static void dfs(List<List<Integer>> rooms, boolean[] marked, int key) {
        marked[key] = true;
        for (Integer k : rooms.get(key)) {
            if (!marked[k])
                dfs(rooms, marked, k);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
//        List<Integer> room1 = new ArrayList<Integer>() {{add(1);add(3);}};
//        List<Integer> room2 = new ArrayList<Integer>() {{add(3);add(0);add(1);}};
//        List<Integer> room3 = new ArrayList<Integer>() {{add(2);}};
        List<Integer> room1 = new ArrayList<Integer>() {{add(1);}};
        List<Integer> room2 = new ArrayList<Integer>() {{add(2);}};
        List<Integer> room3 = new ArrayList<Integer>() {{add(3);}};
        List<Integer> room4 = new ArrayList<Integer>() {{}};
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        System.out.println(canVisitAllRooms(rooms));
    }
}
