package zutil;

/**
 * @author Yue Lin
 * @since 2018-04-13
 */
public class SubString {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int curLen = 0, head = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i - curLen - 1, i)) {
                head = i - curLen - 1;
                curLen += 2;
            } else if (isPalindrome(s, i - curLen, i)) {
                head = i - curLen;
                curLen += 1;
            }
        }
        return s.substring(head, curLen + head);
    }

    public static boolean isPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r) {
            if (s.charAt(l) != s.charAt(r)) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        if (l < 0) return false;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
