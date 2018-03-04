package zbook;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * @author Yue
 * @since 2018/1/25
 */
public class StackQueue<T> {

    private Stack<T> stack1, stack2;

    public StackQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void add(T val) {
        stack1.add(val);
    }

    public T delete() {
        if (stack1.empty() && stack2.empty())
            return null;
        if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
