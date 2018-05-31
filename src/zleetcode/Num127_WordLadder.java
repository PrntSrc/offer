package zleetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author Yue Lin
 * @since 2018-05-31
 */
public class Num127_WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = 0;
        if (!wordList.contains(endWord)) return len;
        Set<String> marked = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        marked.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                beginWord = queue.poll();
                if (beginWord.equals(endWord))
                    return len + 1;
                for (String word : wordList) {
                    if (!marked.contains(word) && validTransformation(beginWord, word)) {
                        marked.add(word);
                        queue.offer(word);
                    }
                }
            }
            len++;
        }
        return 0;
    }

    private static boolean validTransformation(String beginWord, String word) {
        int count = 0;
        for (int i = 0; i < beginWord.length(); i++) {
            if (beginWord.charAt(i) != word.charAt(i))
                count++;
            if (count > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String beginWord = "hot", endWord = "cog";
        List<String> wordList = new ArrayList<String>(){{
            add("hot");
//            add("dot");
//            add("dog");
//            add("lot");
//            add("log");
            add("cog");
        }};
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
}
