
import java.util.*;

public class merge_two_sorted_lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 != null) {
            pre.next = l1;
        } else if (l2 != null) {
            pre.next = l2;
        }   

        return dummyHead.next;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
