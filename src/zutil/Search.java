package zutil;

/**
 * @author Yue Lin
 * @since 2018-03-30
 */
public class Search {

    // 二分搜索 排序数组查找第一个K值下标，不存在返回-1
    /**
     * search the first k in a sorted array by using binary search
     * @param sortedArray the sorted array for searching
     * @param k the search target
     * @return the index of first k, return -1 if k dose not exist
     */
    public static int getFirstK(int[] sortedArray, int k) {
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

    // 二分搜索 排序数组查找最后一个K值下标，不存在返回-1
    /**
     * search the last k in a sorted array by using binary search
     * @param sortedArray the sorted array for searching
     * @param k the search target
     * @return the index of last k, return -1 if k dose not exist
     */
    public static int getLastK(int[] sortedArray, int k) {
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
}
