package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-06-04
 */
public class Num392_IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }

    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "axe";
        System.out.println(isSubsequence(s, t));
    }

}
