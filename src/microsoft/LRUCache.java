package microsoft;

import java.util.HashMap;

/**
 * @author Yue Lin
 * @since 2018-05-13
 */
public class LRUCache {

    private class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
            this(0, 0);
        }
    }

    private int capacity;
    private int count;
    private HashMap<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        count = 0;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
//        remove(node);
        update(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, value);
            add(node);
            map.put(key, node);
            count++;
        } else {
            node.value = value;
            update(node);
        }

        if (count > capacity) {
            Node toDel = tail.pre;
            remove(toDel);
            map.remove(toDel.key);
            count--;
        }
    }

    private void update(Node node) {
        remove(node);
        add(node);
    }

    private void add(Node node) {
        Node next = head.next;
        head.next = node;
        node.pre = head;
        node.next = next;
        next.pre = node;
    }

    private void remove(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }
}
