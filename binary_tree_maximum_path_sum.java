
import java.util.*;

public class binary_tree_maximum_path_sum {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public int maxPathSum(TreeNode root) {
     	if (root == null) return 0;

		int left = Math.max(maxPathSum(root.left), 0);
		int right = Math.max(maxPathSum(root.right), 0);   

		int leftRoot = Math.max(left+root.val, root.val);
		int rightRoot = Math.max(right+root.val, root.val);
		return Math.max(Math.max(leftRoot, rightRoot), left+right+root.val);
    }		
}