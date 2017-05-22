


public class populating_next_right_pointers_in_each_node {
	static class TreeLinkNode {
		int val;
		TreeLinkNode left;
		TreeLinkNode right;
		TreeLinkNode next;
		TreeLinkNode(int x) { val = x;}
	}		

    public static void connect(TreeLinkNode root) {
     	TreeLinkNode parent = null;

     	while (root != null) {
     		TreeLinkNode pre = null;
     		while (parent != null) {
     			if (pre == null) {
     				pre = parent.right;
     			} else {
     				pre.next = parent.left;
     				pre = parent.right;
     			}
     			parent.left.next = parent.right;
     			parent = parent.next;
     		}
     		parent = root;
     		root = root.left;
     	}   
    }

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(0);
		root.left = new TreeLinkNode(1);
		root.right = new TreeLinkNode(2);
		root.left.left = new TreeLinkNode(3);
		root.left.right = new TreeLinkNode(4);
		root.right.left = new TreeLinkNode(5);
		root.right.right = new TreeLinkNode(6);


		connect(root);
	}
}