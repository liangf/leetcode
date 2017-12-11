


public class Reverse_Linked_List {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}


    public ListNode reverseList(ListNode head) {
    	if (head == null) return null;

     	return help(head, head.next);   
    }	

    // 1->2->3->null
    ListNode help(ListNode cur, ListNode next) {
    	if (next == null) {
    		return cur;
    	}

    	ListNode T = help(next, next.next);
    	next.next = cur;
    	cur.next = null;
    	return T;
    }
 
	public static void main(String[] args) {

	}
}