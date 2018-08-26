
import java.util.*;

public class Remove_Linked_List_Elements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode p = dummy.next;
        while (p != null) {
            if (p.val == val) {
                pre.next = p.next;
            } else {
               pre = p;
            }
            p = p.next;
        }
        return dummy.next;   
    }

	public static void main(String[] args) {

	}
}
