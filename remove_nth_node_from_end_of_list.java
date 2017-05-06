
import java.util.*;

public class remove_nth_node_from_end_of_list {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	int len = 0, count = 0;
    	ListNode p = head;
    	while (p != null) {
    		++len;
    		p = p.next;
    	}    

    	if (len - n == 0) {
    		return head.next; 
    	}

    	p = head;
    	while (p != null) {
    		++count;
    		if (count == len - n) {
    			p.next = p.next != null ? p.next.next : null;
    			break;
    		}
    		p = p.next;
    	}
    	return head;
    }

    public static void test(ListNode node) {
    	node.next = new ListNode(999);
    }

	public static void main(String[] args) {

		System.out.println("hello");

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		ListNode head = removeNthFromEnd(n1, 4);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}

		// test(n1);
		// while (n1 != null) {
		// 	System.out.println(n1.val);
		// 	n1 = n1.next;
		// }
	}
}
