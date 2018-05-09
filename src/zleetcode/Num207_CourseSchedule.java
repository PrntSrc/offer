package zleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yue Lin
 * @since 2018-05-04
 */
public class Num207_CourseSchedule {

    // todo dfs
//    public static boolean canFinish(int numCourses, int[][] prerequisites) {
//        List[] graph = new List[numCourses];
//        for (int i = 0; i < numCourses; i++)
//            graph[i] = new ArrayList<>();
//        boolean[] visited = new boolean[numCourses];
//        for (int[] p : prerequisites)
//            graph[p[1]].add(p[0]);
//        for (int i = 0; i < numCourses; i++) {
//            if (!dfs(graph, visited, i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean dfs(List[] graph, boolean[] visited, int course) {
//        if (visited[course]) return false;
//        else visited[course] = true;
//        for (int i = 0; i < graph[course].size(); i++) {
//            if (!dfs(graph, visited, (int)graph[course].get(i))) return false;
//        }
//        visited[course] = false;
//        return true;
//    }

    // todo bsf
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] graph = new List[numCourses];
        int[] degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList();

        for (int[] p : prerequisites) {
            degree[p[1]]++;
            graph[p[0]].add(p[1]);
        }

        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (queue.size() != 0) {
            int course = queue.poll();
            for (int i = 0; i < graph[course].size(); i++) {
                int pointer = (int)graph[course].get(i);
                degree[pointer]--;
                if (degree[pointer] == 0) {
                    queue.add(pointer);
                    count++;
                }
            }
        }
        return count == numCourses;

    }

    public static void main(String[] args) {
        int numCourses = 3;
        int[][] prerequisites = new int[][] {
                {1, 0},
                {0, 2}
        };

        System.out.println(canFinish(numCourses, prerequisites));
    }
}
