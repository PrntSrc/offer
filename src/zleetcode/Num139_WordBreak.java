package zleetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-24
 */
public class Num139_WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "a";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        System.out.println(wordBreak(s, wordDict));
    }
}
