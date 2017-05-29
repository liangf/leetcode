


public class linked_list_cycle {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
    	ListNode slow = head;
    	ListNode fast = head.next.next;

    	while (fast != null && fast.next != null) {
    		if (fast == slow) {
    			return true;
    		}
    		slow = slow.next;
    		fast = fast.next.next;
    	} 
    	return false;  
    }	
	
	public static void main(String[] args) {

	}
}