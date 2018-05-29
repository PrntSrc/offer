package zleetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-05-04
 */
public class Num207_CourseSchedule1 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] graph = new List[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();
        for (int[] p : prerequisites)
            graph[p[1]].add(p[0]);
        boolean[] marked = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, marked, i))
                return false;
        }
        return true;
    }

    private static boolean dfs(List[] graph, boolean[] marked, int v) {
        if (marked[v]) return false;
        marked[v] = true;
        for (int i = 0; i < graph[v].size(); i++) {
            if (!dfs(graph, marked, (Integer) graph[v].get(i)))
                return false;
        }
        marked[v] = false;
        return true;
    }

    public static void main(String[] args) {
        int numCourses = 3;
        int[][] prerequisites = new int[][] {
                {1, 0},
                {0, 1}
        };

        System.out.println(canFinish(numCourses, prerequisites));
    }
}
