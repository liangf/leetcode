


public class sort_list {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

    public ListNode sortList(ListNode head) {
    	return divide(head);   
    }

    public ListNode findMid(ListNode head) {
    	ListNode pre = null, slow = head, fast = head;
    	while (fast != null && fast.next != null) {
    		pre = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	pre.next = null;
    	return slow;
    }

    public ListNode divide(ListNode head) {
    	if (head == null || head.next == null) return head;
    	
    	ListNode mid = findMid(head);
    	ListNode left = divide(head);
    	ListNode right = divide(mid);
    	return merge(left, right);
    }

    public ListNode merge(ListNode L1, ListNode L2) {
    	ListNode dummy = new ListNode(-1);
    	ListNode p = dummy;

    	while (L1 != null && L2 != null) {
    		if (L1.val < L2.val) {
    			p.next = L1;
    			L1 = L1.next;
    		} else {
    			p.next = L2;
    			L2 = L2.next;
    		}
    		p = p.next;
    	}
    	if (L1 != null) p.next = L1;
    	if (L2 != null) p.next = L2;
    	return dummy.next;
    }

	public static void main(String[] args) {

	}
}