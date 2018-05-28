package microsoft;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 最近最久未使用
 * @author Yue Lin
 * @since 2018-05-13
 */
public class LRU {

    static class Leaf {
        int num;
        public Leaf(int num) {
            this.num = num;
        }
    }

    private Queue<Integer> queue;
    private int size;

    public LRU(int size) {
        queue = new LinkedList<>();
        this.size = size;
    }

    public void use(Leaf leaf) {
        queue.remove(leaf.num);
        if (queue.size() >= size) queue.poll();
        queue.offer(leaf.num);
    }

    public void print() {
        for (int i : queue) System.out.print(i + " ");
    }

    public static void main(String[] args) {
        LRU lru = new LRU(5);
        int[] leaves = new int[] {4, 7, 0, 7, 1, 0, 1, 2, 1, 2, 6};
        for (int i : leaves) {
            lru.use(new Leaf(i));
            lru.print();
            System.out.println();
        }
    }
}
