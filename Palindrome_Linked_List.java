


public class Palindrome_Linked_List {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

    public boolean isPalindrome(ListNode head) {
    	if (head == null || head.next == null) return true;

    	ListNode slow = head;
    	ListNode fast = head.next.next;    
    	while (fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}

    	fast = reverse(slow.next);
    	slow.next = null;
    	slow = head;

    	while (slow != null) {
    		if (slow.val != fast.val) {
    			return false;
    		}
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return true;
    }

    public ListNode reverse(ListNode head) {
    	ListNode dummy = new ListNode(-1);
    	while (head != null) {
    		ListNode tmp = head.next;
    		head.next = dummy.next;
    		dummy.next = head;
    		head = tmp;
    	}
    	return dummy.next;
    }

	public static void main(String[] args) {

	}	
}