
import java.util.*;

public class binary_tree_inorder_traversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public List<Integer> inorderTraversal(TreeNode root) {
    	Stack<TreeNode> stk = new Stack<TreeNode>();
    	List<Integer> res = new ArrayList<Integer>();

    	while (root != null || !stk.empty()) {
    		while (root != null) {
    			stk.push(root);
    			root = root.left;
    		}
    		root = stk.pop();
    		res.add(root.val);
    		root = root.right;
    	}	     
    	return res; 
    }

	public static void main(String[] args) {

	}
}