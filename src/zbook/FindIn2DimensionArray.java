package zbook;

/**
 * 二维数组中查找是否含有某值
 * 按行升序 按列升序
 * @author Yue
 * @since 2018/1/21
 */
public class FindIn2DimensionArray {

    public static boolean contains(int[][] nums, int key) {
        int len = nums.length, i = 0, j = len - 1;
        while (i < len && j >= 0) {
            if (key > nums[i][j]) i++;
            else if (key < nums[i][j]) j--;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO 判断边界条件 下为例子
        int[][] nums = new int[][] {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int key = 7;
        System.out.println(contains(nums, 1));
    }
}
