


public class insertion_sort_list {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);

        while (head != null) {
        	ListNode tmp = head.next;
        	ListNode p = dummy;
        	while (p.next != null && head.val > p.next.val) {
        		p = p.next;
        	}
        	head.next = p.next;
        	p.next = head;
        	head = tmp;
        }
    	return dummy.next;
    }

	public static void main(String[] args) {

	}
}