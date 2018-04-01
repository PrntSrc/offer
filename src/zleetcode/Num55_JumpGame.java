//package zleetcode;
//
///**
// * @author Yue Lin
// * @since 2018-04-01
// */
//public class Num55_JumpGame {
//
//    public static boolean canReachLastIndex(int[] nums) {
//        return reachEnd(nums, 0);
//    }
//
//    private static boolean reachEnd(int[] nums, int x) {
//        if (x >= nums.length - 1) return true;
//        boolean res = false;
//        int i = nums[x];
//        if (i == 0) return i == nums.length - 1;
//        for (int step = 1; step <= i; step++) {
//            res = reachEnd(nums, x + step);
//            if (res) break;
//        }
//        return res;
//    }
//
//    private static boolean reachLastIndex(int[] nums, int x) {
//        boolean res = false;
//        while (x < nums.length - 1) {
//            int i = nums[x];
//            while (i != 0) {
//                int temp = i;
//                for (int step = 1; x < x + temp && i != 0; x += step) {
//                    i = nums[x + step];
//                }
//
//            }
//            for (int i = nums[x]; i)
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] numA = new int[] {2, 3, 1, 1, 4};
//        int[] numB = new int[] {3, 2, 1, 0, 4};
//        int[] numC = new int[] {3, 0};
//        int[] numD = new int[] {2, 5, 2, 0, 3, 0, 0, 6};
//        int[] numE = new int[] {2, 5, 0, 0};
//        System.out.println(canReachLastIndex(numA));
//        System.out.println(canReachLastIndex(numB));
//        System.out.println(canReachLastIndex(numC));
//        System.out.println(canReachLastIndex(numD));
//        System.out.println(canReachLastIndex(numE));
//    }
//}
