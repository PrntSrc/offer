package zbook;

/**
 * 旋转数组的最小值
 * @author Yue
 * @since 2018/3/3
 */
public class MinimumOfRotateArray {

    public static int getMinimum(int[] rotateArray) {
        int l = 0, h = rotateArray.length - 1;
        while (rotateArray[l] >= rotateArray[h]) {
            if (h - l == 1)
                return rotateArray[h];
            int m = l + (h - l) / 2;
            if (rotateArray[l] == rotateArray[h] && rotateArray[l] == rotateArray[m])
                return getMinimumInOrder(rotateArray, l, h);
            if (rotateArray[m] >= rotateArray[l])
                l = m;
            else if (rotateArray[m] <= rotateArray[h])
                h = m;
        }
        return rotateArray[l];
    }

    private static int getMinimumInOrder(int[] rotateArray, int l, int h) {
        int res = rotateArray[l];
        for (int i = l + 1; i <= h; i++) {
            if (rotateArray[i] < res)
                res = rotateArray[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] rotateArray = new int[] {1, 0, 1, 1, 1};
        System.out.println(getMinimum(rotateArray));
    }

}
