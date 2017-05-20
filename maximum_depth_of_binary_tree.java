



public class maximum_depth_of_binary_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	
	
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (left < right ? right : left)+ 1;
    }
}