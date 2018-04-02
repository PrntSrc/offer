package zleetcode;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class Num34_SearchForARange {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = getFirstK(nums, target);
        res[1] = getLastK(nums, target);
        return res;
    }

    private static int getFirstK(int[] sortedArray, int k) {
        int l = 0, h = sortedArray.length - 1, m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (sortedArray[m] == k) {
                if (m == 0 || sortedArray[m - 1] != k) return m;
                else h = m - 1;
            } else if (sortedArray[m] < k) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    private static int getLastK(int[] sortedArray, int k) {
        int l = 0, h = sortedArray.length - 1, m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (sortedArray[m] == k) {
                if (m == sortedArray.length - 1 || sortedArray[m + 1] != k) return m;
                else l = m + 1;
            } else if (sortedArray[m] < k) l = m + 1;
            else h = m - 1;
        }
        return - 1;
    }

    public static void main(String[] args) {

    }
}
