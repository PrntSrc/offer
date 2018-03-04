package huawei.developer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 明明的随机数 建个1001长度的数组 试试treeSet
 * @author Yue
 * @since 2018/1/31
 */
public class MingsRandomNum {

    private static void removeDuplicateAndSort(int[] nums) {
        int k = nums.length;
        Set<Integer> set = new HashSet<>();
        // TODO 判断 nums.length > 0 ?
        set.add(nums[0]);
        for (int i = 0; i < k - 1; i++) {
            int j = i + 1;
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                for (; j > 0 && nums[j] < nums[j - 1]; j--)
                    exchange(nums, j - 1, j);
            } else {
                exchange(nums, j, --k);
                i--;
            }
        }
        for (int i = 0; i < k; i++)
            System.out.println(nums[i]);

    }

    private static void exchange(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            removeDuplicateAndSort(nums);
        }
    }

}
