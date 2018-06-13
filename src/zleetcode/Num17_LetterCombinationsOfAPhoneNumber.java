package zleetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Yue Lin
 * @since 2018-06-10
 */
public class Num17_LetterCombinationsOfAPhoneNumber {

    private static Map<Character, List<Character>> graph;

    private static void createGraph() {
        char c = 'a' - 1;
        for (int i = 2; i <= 9; i++) {
            List<Character> temp = new ArrayList<>();
            int len = i < 7 || i == 8 ? 3 : 4, t = 1;
            while (t <= len) {
                temp.add((char)(c + t));
                t++;
            }
            graph.put((char)(i - '0'), temp);
        }
    }

    public static List<String> letterCombinations(String digits) {
        createGraph();
        List<String> res = new ArrayList<>();
        boolean[] marked = new boolean[26];
//        Queue<Character> queue = new LinkedList<>();
//        int len = 0;
//        queue.offer(digits.charAt(len));
//        while (!queue.isEmpty()) {
//            List<Character> temp = graph.get(queue.poll());
//            for (int i = 0; i < temp.size(); i++) {
//                char c = temp.get(i);
//                if (marked[c - 'a']) return res;
//                marked[c - 'a'] = true;
//
//                if (len + 1 < digits.length()) queue.offer(digits.charAt(len));
//            }
//        }
        return res;
    }

    private static void dfs(Map<Character, List<Character>> graph, char g, boolean[] marked, List<String> res, String digits, int start, StringBuilder sb) {
//        List<Character> temp1 = graph.get(digits.charAt(start));
//        for (int i = 0; i < temp1.size(); i++) {
//            if (marked[temp1.get(i)]) continue;
//            marked[temp1.get(i)] = true;
//            List<Character> temp2 = graph.get(digits.charAt(start + 1));
//            for (int j = 0; j < temp2.size(); j++) {
//                if (!marked[temp2.get(j)])
//                    dfs(graph, );
//            }
//        }
    }

    public static void main(String[] args) {
        String digits = "23";

    }
}
