

public class partition_list {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		} 
	}

    public ListNode partition(ListNode head, int x) {
        ListNode L1 = new ListNode(-1);
        ListNode L2 = new ListNode(-1);
        ListNode p1 = L1, p2 = L2;

        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p1.next = L1.next;
        p2.next = null;
        return L1.next;
    }

	public static void main(String[] args) {

	}
}