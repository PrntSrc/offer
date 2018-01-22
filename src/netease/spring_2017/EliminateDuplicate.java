package netease.spring_2017;

import java.util.*;

public class EliminateDuplicate {

    public static String getUniqueElementStr(int[] sequence) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sequence.length; i++)
            map.put(sequence[i], i);
        for (int v : map.values())
            sequence[v] = -sequence[v];
        for (int s : sequence)
            if (s < 0)
                sb.append(-s).append(" ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++)
            sequence[i] = sc.nextInt();
        System.out.println(getUniqueElementStr(sequence));
    }
}
