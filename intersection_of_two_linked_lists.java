


public class intersection_of_two_linked_lists {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0, l2 = 0, count = 0;
        ListNode p1 = headA, p2 = headB;

        while (p1 != null) {
        	++l1;
        	p1 = p1.next;
        }
        while (p2 != null) {
        	++l2;
        	p2 = p2.next;
        }

        if (l1 > l2) {
        	p1 = headA;
        	p2 = headB;
        	while (p1 != null) {
        		if (count++ >= l1 - l2) {
        			break;
        		}
        		p1 = p1.next;
        	}
        	while (p1 != null) {
        		if (p1 == p2) {
        			return p1;
        		}
        		p1 = p1.next;
        		p2 = p2.next;
        	}
        	return null;
        } else {
            p1 = headA;
        	p2 = headB;
        	while (p2 != null) {
        		if (count++ >= l2 - l1) {
        			break;
        		}  
        		p2 = p2.next;
        	}
        	while (p1 != null) {
        		if (p1 == p2) {
        			return p1;
        		}
        		p1 = p1.next;
        		p2 = p2.next;
        	}
        	return null;
        } 
    }

	public static void main(String[] args) {

	}
}