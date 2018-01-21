package baidu.spring_2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Yue on 2018/1/13.
 * 有趣的排序
 */
public class FunnySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();
        System.out.println(sortTimes(nums));
    }

    public static int sortTimes(int[] nums) {
        int l = nums.length;
        if (l <= 1) return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++)
            map.put(nums[i], i);
        Arrays.sort(nums);
        for (int i = 0, t = l; i < t - 1; i++) {
            if (map.get(nums[i + 1]) < map.get(nums[i])) {
                map.put(nums[i + 1], l++);
                count++;
            }
        }
        return count;
    }
}
