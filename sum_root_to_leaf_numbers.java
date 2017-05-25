
import java.util.*;


public class sum_root_to_leaf_numbers {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public int sumNumbers(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();

    	res.add(0);
    	help(root, 0, res);
    	return res.get(0);
    }

    public void help(TreeNode root, int sum, List<Integer> res) {
    	if (root == null) return;
    	if (root.left==null && root.right==null) {
    		res.set(0, res.get(0)+sum*10+root.val);
    		return;
    	}

    	help(root.left, sum*10+root.val, res);
    	help(root.right, sum*10+root.val, res);
    }

    public int help(TreeNode root, int sum) {
    	if (root == null) return 0;
    	if (root.left==null && root.right==null) {
    		return sum*10 + root.val;
    	}

    	return help(root.left, sum*10+root.val) + help(root.right, sum*10+root.val);
    }

	public static void main(String[] args) {

	}
}