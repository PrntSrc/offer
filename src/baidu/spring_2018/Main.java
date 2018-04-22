package baidu.spring_2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author Yue Lin
 * @since 2018-04-21
 */
public class Main {

    private static Map<Integer, List<Integer>> adj = new HashMap<>();
    private static int[] edgeTo;
    private static boolean[] marked;

    public static int[] getMaxRestTime(int city, int road, int delivery, int[][] time, int[][] timeLimit) {
        int[] res = new int[delivery];
        edgeTo = new int[city];
        marked = new boolean[city];
        setAdj(time);
        dfs(time, 1);
        for (int p: pathTo(4)) System.out.println(p);
        return null;
    }

    private static void dfs(int[][] graph, int v) {
        marked[v - 1] = true;
        for (int w : adj.get(v)) {
            if (!marked[w - 1]) {
                edgeTo[w - 1] = v;
                dfs(graph, w);
            }
        }
    }

    private static boolean hasPath(int v) {
        return marked[v - 1];
    }

    private static Stack<Integer> pathTo(int v) {
        if (!hasPath(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != 1; x = edgeTo[x - 1]) path.push(x);
        path.push(1);
        return path;
    }

    private static void setAdj(int[][] graph) {
        for (int[] g : graph) {
            for (int j = 0; j < 2; j++) {
                int key = g[j];
                List<Integer> list = new ArrayList<>();
                if (adj.containsKey(key)) list = adj.get(key);
                list.add(g[j == 0 ? 1 : 0]);
                adj.put(key, list);
            }
        }
    }

    public static void main(String[] args) {
        int[][] time = new int[][] {
                {1, 2, 5},
                {2, 3, 10},
                {3, 4, 20},
                {1, 4, 1}};
        int[][] timeLimit = new int[][] {
                {2, 65},
                {3, 15}};
        int city = 4, road = 4, delivery = 2;
        getMaxRestTime(city, road, delivery, time, timeLimit);
    }
}
