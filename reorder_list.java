


public class reorder_list {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head, pre = null;

        while (fast != null && fast.next != null) {
        	pre = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        pre.next = null;

        ListNode dummy = new ListNode(-1);
        while (slow != null) {
        	ListNode tmp = slow.next;
        	slow.next = dummy.next;
        	dummy.next = slow;
        	slow = tmp;
        }

        fast = head;
        slow = dummy.next;
        while (fast != null) {
        	ListNode fastNext = fast.next;
        	ListNode slowNext = slow.next;
        	fast.next = slow;
        	if (fastNext != null) slow.next = fastNext;
        	fast = fastNext;
        	slow = slowNext;
        }   
    }

	public static void main(String[] args) {

	}
}