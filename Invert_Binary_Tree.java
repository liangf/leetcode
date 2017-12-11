


public class Invert_Binary_Tree {
	
 	public class TreeNode {
 		int val;
 		TreeNode left;
 		TreeNode right;
		TreeNode(int x) { val = x; }
	}

    public TreeNode invertTree(TreeNode root) {
        help(root);
        return root;
    }

    public void help(TreeNode root) {
    	if (root.left == null || root.right == null) return;

    	help(root.left);
    	help(root.right);

    	TreeNode tmp = root.left;
    	root.left = root.right;
    	root.right = tmp;
    }

	public static void main(String[] args) {

	}
}