package zbook;

/**
 * @author Yue Lin
 * @since 2018-03-25
 */
public class MyHeap {

    private static int[] heap;
    private static int num;

    public MyHeap(int n) {
        heap = new int[n + 1];
    }

    // 最大堆的上浮 大的->上浮
    private static void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exchange(k / 2, k);
            k = k / 2;
        }
    }

    // 最大堆的下沉  小的->下沉
    private static void sink(int k) {
        while (2 * k <= num) {
            int j = 2 * k;
            if (j < num && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exchange(k, j);
            k = j;
        }
    }

    public static int getMax() {
        int max = heap[1];
        exchange(1, num--);
        // todo 游离 置null
        heap[num + 1] = 0;
        sink(1);
        return max;
    }


    private static boolean less(int x, int y) {
        return heap[x] < heap[y];
    }

    private static void exchange(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }

    public static void main(String[] args) {

    }
}
