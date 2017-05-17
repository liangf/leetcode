


public class validate_binary_search_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }	

    public boolean help(TreeNode root, TreeNode min, TreeNode max) {
    	if (root == null) return true;
    	if (min == null && max != null) {
    		if (root.val >= max.val) return false;
    	}
    	if (max == null && min != null) {
    		if (root.val <= min.val) return false;
    	}
    	if (min != null && max != null) {
    		if (root.val <= min.val || root.val >= max.val) return false;
    	}

    	boolean left = help(root.left, min, root);
    	boolean right = help(root.right, root, max);
    	return left && right;
    }	

    public static void main(String[] args) {

    }
}