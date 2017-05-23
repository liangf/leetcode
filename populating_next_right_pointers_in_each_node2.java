


public class populating_next_right_pointers_in_each_node2 {
	static class TreeLinkNode {
		int val;
		TreeLinkNode left;
		TreeLinkNode right;
		TreeLinkNode next;
		TreeLinkNode(int x) { val = x;}
	}		

    public static void connect(TreeLinkNode root) {
     	TreeLinkNode pre = null, head = null, cur = root;

        while (cur != null) {
            while (cur != null) {
                if (cur.left != null) {
                    if (pre == null) {
                        pre = cur.left;
                        head = pre;
                    } else {
                        pre.next = cur.left;
                        pre = pre.next;
                    }
                }
                if (cur.right != null) {
                    if (pre == null) {
                        pre = cur.right;
                        head = pre;
                    } else {
                        pre.next = cur.right;
                        pre = pre.next;
                    }
                }
                cur = cur.next;
            }
            cur = head;
            head = null;
            pre = null;            
        }  
    }

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);


		connect(root);
	}
}