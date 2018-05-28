package google;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-05-27
 */
public class A {

    private static Set<Integer> circle = new HashSet<>();

    public static int getMinDis(int n, int[][] tubes) {
        return 0;
    }

    private static void findCircle(int n, int[][] tubes) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                ArrayList<Integer> list = graph[tubes[i][j]];
                if (list == null) list = new ArrayList<>();
                list.add(tubes[i][1 - j]);
            }
        }

    }

    private static void dfs(int n, int start, int index, ArrayList<Integer>[] graph) {
        if (circle.contains(index)) return;
        for (int i = index; i < n; i++) {
            circle.add(index);
            for (int j = 0; j < graph[index - 1].size(); j++)
//                dfs(graph[index - 1].get(j), graph);
            circle.remove(index);
        }
    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Yue\\Desktop\\", readName = "hello.txt", writeName = "out.txt";
        BufferedReader in = new BufferedReader(new FileReader(path + readName));
        BufferedWriter out = new BufferedWriter(new FileWriter(path + writeName));
        String s;
        int t = Integer.valueOf(in.readLine());
        while (t-- > 0) {
            int n = Integer.valueOf(in.readLine());
            int[][] tubes = new int[n][2];
            for (int i = 0; i < n && (s = in.readLine()) != null; i++) {
                tubes[i][0] = Integer.valueOf(s.split(" ")[0]);
                tubes[i][1] = Integer.valueOf(s.split(" ")[1]);
            }
            System.out.println(getMinDis(n, tubes));
        }

        in.close();
        out.close();
    }
}
