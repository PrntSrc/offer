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

    private static List<Integer>[] graph;

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        List<Integer> res = new LinkedList<>();
        generateGraph(numCourses, prerequisites);
        for (int[] prerequisite : prerequisites)
            graph[prerequisite[0]].add(prerequisite[1]);

        for (int i = 0; i < numCourses; i++) {
            if (graph[i].isEmpty()) res.add(i);
            else i = graph[i].get(0);
        }

        return order;
    }

    private static void dfs(List<Integer> graph, boolean[] visited, int course, List<Integer> order) {
        if (visited[course]);
    }

    private static void generateGraph(int numCourse, int[][] prerequisites) {
        graph = new List[numCourse];
        for (int i = 0; i < numCourse; i++) graph[i] = new ArrayList<>();
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(order));
    }
}
