package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-10
 */
public class Num210_CourseScheduleII {

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List[] graph = new List[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();
        for (int[] p : prerequisites)
            graph[p[1]].add(p[0]);
        boolean[] marked = new boolean[numCourses];
        int[] order = new int[numCourses];
        Arrays.fill(order, -1);
        return dfs(graph, 0, marked, order, new ArrayList<>()) ? order : null;
    }

    private static boolean dfs(List[] graph, int index, boolean[] marked, int[] order, ArrayList<Integer> temp) {
        if (marked[index]) return false;
        if (graph[index].size() == 0 && temp.size() > 0) {
            range(order, temp);
            return true;
        }
        marked[index] = true;
        for (int i = 0; i < graph[index].size(); i++) {
            int t = (Integer) graph[index].get(i);
            if (!marked[t]) {
                temp.add(t);
                if (!dfs(graph, t, marked, order, temp))
                    return false;
                temp.remove(temp.size() - 1);
            }
        }
        marked[index] = false;
        return true;
    }

    private static void range(int[] order, ArrayList<Integer> list) {
        if (list.size() == 1) {
            int i = 0;
            while (order[i] != -1) i++;
            order[i] = list.get(0);
        } else {

        }
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(order));
    }
}
