
import java.util.*;

public class rotate_list {
    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int len = 0, count = 1;
        ListNode p = head, last = null;
        while (p != null) {
            ++len;
            last = p;
            p = p.next;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        p = head;
        while (count < len - k) {
            ++count;
            p = p.next;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = p.next;
        p.next = null;
        last.next = dummy.next;

        return dummy.next;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
