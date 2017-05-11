

public class remove_duplicates_from_sorted_list {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		} 
	}

    public ListNode deleteDuplicates(ListNode head) {
    	ListNode pre = null, cur = head;

    	while (cur != null) {
    		if (pre!=null && cur.val==pre.val) {
    			pre.next = cur.next;
    			cur = cur.next;
    		} else {
    			pre = cur;
    			cur = cur.next;
    		}
    	}  
    	return head;  
    }

	public static void main(String[] args) {

	}
}