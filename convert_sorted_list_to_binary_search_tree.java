


public class convert_sorted_list_to_binary_search_tree {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
 	}	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public TreeNode sortedListToBST(ListNode head) {
    	return help(head);
    }

    public TreeNode help(ListNode head) {
    	if (head == null) return null;
    	if (head.next == null) return new TreeNode(head.val);

    	ListNode mid = getMidNode(head);
    	TreeNode root = new TreeNode(mid.val);
    	root.left = help(head);
    	root.right = help(mid.next);
    	return root;
    }	

    public ListNode getMidNode(ListNode head) {
    	ListNode slow = head, fast = head, pre = null;
    	while (fast != null && fast.next != null) {
    		pre = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	pre.next = null;
    	return slow;
    }
}