package jingdong;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Lin
 * @since 2018-05-19
 */
public class MyHashSet {

    private ArrayList[] vals;
    private int size = 16;
    private int curSize = 0;

    public MyHashSet() {
        vals = new ArrayList[size];
    }

    public boolean contain(int val) {
        int h = hash(val);
        ArrayList<Integer> list = vals[h];
        if (list != null) {
            for (int i : list)
                if (i == val) return true;
        }
        return false;
    }

    public boolean add(int val) {
        if (curSize == size) resize();
        int h = hash(val);
        ArrayList<Integer> list = vals[h];
        if (list != null) {
            if (contain(val)) return false;
            list.add(val);
        } else
            vals[h] = new ArrayList<Integer>(){{add(val);}};
        curSize++;
        return true;
    }

    private int hash(int val) {
        return val & (size - 1);
    }

    private void resize() {
        size <<= 1;
        ArrayList[] newVals = new ArrayList[size];
        for (int i = 0; i < curSize; i++) {
            newVals[(i + 1 & 1) * curSize - 1 + i] = vals[i];
        }
        vals = newVals;
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        System.out.println(set.add(2));
        System.out.println(set.contain(1));
    }
}
