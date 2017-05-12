

public class remove_duplicates_from_sorted_list2 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		} 
	}

    public ListNode deleteDuplicates(ListNode head) {
    	ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, cur = head;

        while (cur != null) {
            ListNode p = cur;
            while (p.next!=null && p.next.val == cur.val) {
                p = p.next;
            }
            if (p == cur) {
                pre = cur;
                cur = cur.next;
            } else {
                pre.next = p.next;
                cur = p.next;
            }
        }
    	return dummy.next;  
    }

	public static void main(String[] args) {

	}
}