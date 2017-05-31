
import java.util.*;

public class LRUCache {
	static class Node {
		int key;
		int val;
		Node next;
        Node pre;
		Node(int key, int val) {
			this.key = key;
			this.val = val;
		}
	}
	private static int count;
	private static int capacity;
	private static Node head;
	private static HashMap<Integer, Node> hmap;

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;   
        head = new Node(0, 0);
        head.next = head;
        head.pre = head;
        hmap = new HashMap<Integer, Node>();
    }
    
    public static int get(int key) {
        if (!hmap.containsKey(key)) return -1;
        Node n = hmap.get(key);
        remove(n);
        addLast(n);
        return n.val;
    }
    
    public static void put(int key, int value) {
        Node n = new Node(key, value);
        if (hmap.containsKey(key)) {
            remove(hmap.get(key));
            addLast(n);            
            return;
        }
        if (count < capacity) {
            addLast(n);
        } else {
            remove(head.next);
            addLast(n);
        }
    }

    public static void remove(Node n) {
        --count;
        hmap.remove(n.key);        
        n.pre.next = n.next;
        n.next.pre = n.pre;
        n.pre = null;
        n.next = null;
    }   

    public static void addLast(Node n) {
        ++count;
        hmap.put(n.key, n);
        n.pre = head.pre;
        head.pre.next = n;
        n.next = head;
        head.pre = n;
    }

	public static void main(String[] args) {

        LRUCache obj = new LRUCache(2);
        obj.put(2, 1);
        obj.put(2, 2);
        System.out.println(obj.get(2));
        obj.put(1, 1);
        obj.put(4, 1);
        System.out.println(obj.get(2));


        // System.out.println(obj.get(2));
        // obj.put(2, 6);
        // System.out.println(obj.get(1));
        // obj.put(1, 5);
        // obj.put(1, 2);
        // System.out.println(obj.get(1));
        // System.out.println(obj.get(2));
	}
}