package microsoft;

import java.util.List;

/**
 * 最近最少使用
 * @author Yue Lin
 * @since 2018-05-13
 */
public class LFU {

    static class Leaf {
        int num;
        int time;
        public Leaf(int num, int time) {
            this.num = num;
            this.time = time;
        }
    }

    private List<Integer> nums;
    private List<Integer> times;
    private int size;
    private int curSize = 0;
    private int minTime = 0;

    public LFU(int size) {
        this.size = size;
    }

    public void use(int num) {
        if (curSize >= size) {
            for (int i = 0; i < size; i++) {
                if (times.get(i) == minTime) {
                    nums.remove(i);
                    times.remove(i);
                    curSize--;
                }
            }
        }
        if (nums.contains(num)) {
            int time = times.get(num);
            times.set(num, time + 1);
        } else {
            nums.add(num);
            minTime = 1;
            times.add(minTime);
            curSize++;
        }
    }
}
