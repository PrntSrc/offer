import java.util.HashMap;
import java.util.Map;

/**
 * @author Yue
 * @since 2018/4/14
 */
public class TestG {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.containsKey(1);
        String s = "ab\n\\cde\125";
        System.out.println(s.toCharArray().length);
    }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        BigDecimal num = new BigDecimal(1);
//        for (int i = 1; i <= n; i++) {
//            num = num.multiply(BigDecimal.valueOf(i));
//        }
//        String str = num.toString();
//        int count = 0;
//        for (int i = str.length()-1; i >=0 ; i--) {
//            if (str.charAt(i)=='0')
//                count++;
//            else break; }
//        System.out.println(count);
//        }
}
