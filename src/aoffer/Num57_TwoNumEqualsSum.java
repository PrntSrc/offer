package aoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class Num57_TwoNumEqualsSum {

    public static int[] findTwoNumEqualsSum(int[] sortedArray, int sum) {
        int[] res = new int[2];
//        Set<Integer> set = new HashSet<>();
//        for (int sa : sortedArray) {
//            if (set.contains(sum - sa)) {
//                res[0] = sum - sa;
//                res[1] = sa;
//            } else
//                set.add(sa);
//        }
        int head = 0, tail = sortedArray.length - 1;
        while (head < tail) {
            if (sortedArray[head] + sortedArray[tail] < sum) head++;
            else if (sortedArray[head] + sortedArray[tail] > sum) tail--;
            else {
                res[0] = sortedArray[head];
                res[1] = sortedArray[tail];
                return res;
            }
        }
        return res;
    }

    // 正整数序列, 长度不小于2
    public static List<List<Integer>> getContinuousSequenceEqualsSum(int sum) {
        List<List<Integer>> res = new ArrayList<>();
        int head = 1, tail = 2, cur = head + tail, end = (sum + 1) >> 1;
        while (head < tail && tail <= end) {
            if (cur > sum) {
                cur -= head;
                head++;
            } else {
                if (cur == sum) {
                    List<Integer> temp = new ArrayList<>();
                    for (int i = head; i <= tail; i++)
                        temp.add(i);
                    res.add(temp);
                }
                tail++;
                cur += tail;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[] {1, 2, 4, 7, 11, 15};
        int sum = 15;
        for (int i :findTwoNumEqualsSum(sortedArray, sum))
            System.out.println(i);
        List<List<Integer>> res = getContinuousSequenceEqualsSum(sum);
        res.forEach(System.out::println);
//        for (List<Integer> l : res) {
//            for (int o : l)
//                System.out.print(o + " ");
//            System.out.println();
//        }
//        res.forEach(list -> System.out.println(list.size()));
    }
}
