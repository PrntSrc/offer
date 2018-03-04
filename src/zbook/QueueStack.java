package zbook;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用两个队列实现栈 未完成
 * @author Yue
 * @since 2018/1/25
 */
public class QueueStack<T> {

    private Queue<T> queue1, queue2;

    public QueueStack() {
        queue1 = new LinkedList();
        queue2 = new LinkedList();
    }

    public void add(T val) {
        queue1.add(val);
    }

    public T del() {
//        T
//        while ()
//        queue2.add()
        return queue2.poll();
    }
}
