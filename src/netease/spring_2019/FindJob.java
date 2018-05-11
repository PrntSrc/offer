package netease.spring_2019;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Yue Lin
 * @since 2018-05-09
 */
public class FindJob {

    static class Job {
        int d;
        int p;
        public Job(int d, int p) {
            this.d = d;
            this.p = p;
        }

        @Override
        public String toString() {
            return this.d + "----" + this.p;
        }
    }

    public static void findJob(int n, int m, int[] rawFriends, TreeMap<Integer, Integer> jobs) {
        for (int i = 0; i < m; i++) {
            int key = jobs.floorKey(rawFriends[i]);
            System.out.println(jobs.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> jobs = new TreeMap<>(Comparator.comparingInt(o -> o));
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int p = sc.nextInt();
            if (jobs.containsKey(d) && jobs.get(d) >= p) continue;
            jobs.put(d, p);
        }
        int[] rawFriends = new int[m];
//        Map<Integer, Integer> friends = new TreeMap<>(Comparator.comparingInt(o -> o));
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            rawFriends[i] = a;
//            friends.put(a, 0);
        }
        findJob(n, m, rawFriends, jobs);
    }
}
