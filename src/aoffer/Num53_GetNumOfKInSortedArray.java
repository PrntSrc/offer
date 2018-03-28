package aoffer;

/**
 * @author Yue Lin
 * @since 2018-03-27
 */
public class Num53_GetNumOfKInSortedArray {

    public static int getNumOfK(int[] sortedArray, int k) {
        int first = getFirstK(sortedArray, k);
        int last = getLastK(sortedArray, k);
        return first != -1 ? last - first + 1 : 0;
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
        int[] sortedArray = new int[] {1, 2, 3, 3, 3, 3, 4, 5};
        int k = 3;
        System.out.println(getFirstK(sortedArray, k));
        System.out.println(getLastK(sortedArray, k));
        System.out.println(getNumOfK(sortedArray, k));
    }
}
