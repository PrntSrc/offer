package baidu.spring_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-21
 */
public class Main {

    static class Node {
        int no;
        int time;
        public Node(int no, int time) {
            this.no = no;
            this.time = time;
        }
    }

    private static int[] getMaxRestTime(int numCities, int numRoads, int numDeliveries, int[][] travelTime, int[][] timeLimit) {
        int[] res = new int[numDeliveries];
        List[] graph = new List[numCities + 1];
        for (int i = 1; i <= numCities; i++) graph[i] = new ArrayList();
        for (int[] t : travelTime) {
            graph[t[1]].add(new Node(t[0], t[2]));
            graph[t[0]].add(new Node(t[1], t[2]));
        }
        for (int i = 0; i < numDeliveries; i++) {
            int cur = 0;
            for (int j = 0; j < graph[timeLimit[i][0]].size(); j++) {
                Node temp = (Node)graph[timeLimit[i][0]].get(j);
                cur = Math.min(cur, (dfs(graph, temp, temp.time)));
            }
            if (cur == 0 || cur * 2 > timeLimit[i][1]) res[i] = 0;
            else res[i] = timeLimit[i][1] - cur * 2;
        }
        return res;
    }

    private static int dfs(List[] graph, Node city, int consume) {
        if (city.no == 1) return consume + city.time;
        Node temp = (Node) graph[city.no].get(city.no);
        return 0;
    }

    public static void main(String[] args) {
        int numCities = 4, numRoads = 4, numDeliveries = 2;
        int[][] travelTime = new int[][] {
                {1, 2, 5},
                {2, 3, 10},
                {3, 4, 20},
                {1, 4, 1}};
        int[][] timeLimit = new int[][] {
                {2, 65},
                {3, 15}};
        int[] res = getMaxRestTime(numCities, numRoads, numDeliveries, travelTime, timeLimit);
        System.out.println(Arrays.toString(res));
    }
}
