
import java.util.*;

public class path_sum2 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> item = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        help(root, sum, item, res);
        return res;
    }

    public static void help(TreeNode root, int sum, List<Integer> item, List<List<Integer>> res) {
    	if (root == null) return;
    	if (root.left==null && root.right==null && root.val == sum) {
    		item.add(root.val);
    		res.add(new ArrayList<Integer>(item));
    		item.remove(item.size()-1);
    		return;
    	}

    	item.add(root.val);
    	help(root.left, sum-root.val, item, res);
    	help(root.right, sum-root.val, item, res);
    	item.remove(item.size()-1);
    }

    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);

    	System.out.println(pathSum(root, 3));
    }
}