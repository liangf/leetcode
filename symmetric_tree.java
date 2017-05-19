


public class symmetric_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public boolean isSymmetric(TreeNode root) {
    	if (root == null) return true;
        return help(root.left, root.right);
    }	

    public boolean help(TreeNode left, TreeNode right) {
    	if (left == null || right == null) {
    		return left == null && right == null;
    	}
    	if (left.val != right.val) return false;

    	return help(left.left, right.right) && help(left.right, right.left);
    }
}