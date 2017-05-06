
import java.util.*;

public class swap_nodes_in_pairs {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead, cur = head, next = head.next;
        dummyHead.next = head;

        while (cur != null && cur.next != null) {
            ListNode tmp = cur.next.next;
            cur.next.next = cur;
            pre.next = cur.next;
            cur.next = tmp;

            pre = cur;
            cur = tmp;
        }
        return dummyHead.next;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
