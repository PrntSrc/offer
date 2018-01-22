package zleetcode;

/**
 * leetcode 5 medium
 * @author Yue
 * @since 2018/1/21
 */
public class LongestPalindromicSubstring {

    private int len, start;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            getPalindromeLength(s, i, i); // 长度为奇数
            getPalindromeLength(s, i, i + 1); //长度为偶数
        }
        return s.substring(start, start + len);
    }

    private void getPalindromeLength(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (len < j - i - 1) {
            start = i + 1;
            len = j - i - 1;
        }
    }

}
