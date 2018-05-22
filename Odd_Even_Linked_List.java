
import java.util.*;

public class Odd_Even_Linked_List {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public ListNode oddEvenList(ListNode head) {
    	if (head == null || head.next == null) return head;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddPre = null;
        ListNode evenPre = null;
        ListNode p = head;

        int count = 1;
        while (p != null) {
        	if (count++ % 2 == 0) {
        		if (evenPre == null) {
        			evenPre = p;
        		} else {
        			evenPre.next = p;
        			evenPre = evenPre.next;
        		}
        	} else {
        		if (oddPre == null) {
        			oddPre = p;
        		} else {
        			oddPre.next = p;
        			oddPre = oddPre.next;
        		}
        	}
        	p = p.next;
        } 
        if (evenPre != null) evenPre.next = null;
        if (oddPre != null) oddPre.next = evenHead;
        return oddHead;
    }

	public static void main(String[] args) {

	}
}
