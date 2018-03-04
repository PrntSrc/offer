package zleetcode;

/**
 * @author Yue
 * @since 2018/2/4
 */
public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        int i = 0, j = 0, l = s.length();
        while (i < l && j >= 0 && (s.charAt(i) == ' ' || s.charAt(l - j - 1) == ' ')) {
            if (s.charAt(i) == ' ') i++;
            if (s.charAt(l - j - 1) == ' ') j++;
        }
        StringBuilder sb = new StringBuilder(s.trim()).reverse();
        return "a";
    }

    public static void main(String[] args) {
        String s = "  the sky is blue     ";
        System.out.println(reverseWords(s));
    }
}
