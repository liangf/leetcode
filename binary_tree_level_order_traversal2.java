
import java.util.*;

public class binary_tree_level_order_traversal2 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}		

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Queue<TreeNode> que = new LinkedList<TreeNode>();

    	que.offer(root);
    	while (root != null && !que.isEmpty()) {
    		List<Integer> item = new ArrayList<Integer>();
    		Queue<TreeNode> tmp = new LinkedList<TreeNode>();
    		while ( !que.isEmpty() ) {
    			TreeNode n = que.poll();
    			item.add(n.val);
    			if (n.left != null) {
    				tmp.offer(n.left);
    			}
    			if (n.right != null) {
    				tmp.offer(n.right);
    			}
    		}
    		res.add(item);
    		que = tmp;
    	}
    	Collections.reverse(res);
    	return res;
    }

	public static void main(String[] args) {

	}
}
