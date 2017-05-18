
import java.util.*;

public class validate_binary_search_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
/*
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
*/

    public boolean isValidBST(TreeNode root) {
    	List<Integer> pre = new ArrayList<Integer>();
        return help(root, pre);
    }	

    public boolean help(TreeNode root, List<Integer> pre) {
    	if (root == null) return true;

    	boolean left = help(root.left, pre);
    	if (pre.size() > 0) {
    		if (root.val <= pre.get(0)) return false;
    		pre.set(0, root.val);
    	} else {
    		pre.add(root.val);
    	}
    	boolean right = help(root.right, pre);
    	return left && right;
    }    
    
    public static void main(String[] args) {

    }
}