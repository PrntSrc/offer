package zleetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-04-22
 */
public class Num56_MergeIntervals {

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) return intervals;
//        Comparator<Interval> comp = Comparator.comparingInt(o -> o.start);
        intervals.sort(Comparator.comparingInt(o -> o.start));
        List<Interval> res = new ArrayList<>();
        int i = 1;
        Interval cur = intervals.get(0), next = intervals.get(1);
        while (i < intervals.size()) {
            if (cur.end > next.start) cur = new Interval(cur.start, next.end);
            else {
                res.add(cur);
                cur = next;
            }
            next = intervals.get(++i);
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
