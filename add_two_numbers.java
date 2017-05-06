
import java.util.*;

public class add_two_numbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(-1);
        ListNode nextNode = res;

        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int c = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;

            nextNode.next = new ListNode(c);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            nextNode = nextNode.next;
        }

        if (carry > 0) {
            nextNode.next = new ListNode(carry);
        }

        return res.next;
    }

	public static void main(String[] args) {

		System.out.println("hello");

        String s = "abcd";
        System.out.println(s.substring(1));
	}
}
