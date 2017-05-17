

public class reverse_linked_list2 {
 	class ListNode {
 		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public ListNode reverseBetween(ListNode head, int m, int n) {
    	int count = 1;
    	ListNode pre = null, preM = null, preN = null, p = head;
    	ListNode dummy = new ListNode(0);

    	while (p != null) {
    		if (count == m) {
    			preM = pre;
    			preN = p;
    			while (p != null && count <= n) {
    				ListNode next = p.next;
    				p.next = dummy.next;
    				dummy.next = p;
    				++count;
    				p = next;
    			}
    		} 
    		if (count > n) break;
    		++count;
    		pre = p;
    		p = p.next;
    	} 
    	preN.next = p;
    	if (preM == null) {
    		return dummy.next;
    	}
    	preM.next = dummy.next;
    	return head;
    }

	public static void main(String[] args) {

	}
}