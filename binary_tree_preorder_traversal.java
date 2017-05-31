
import java.util.*;

public class binary_tree_preorder_traversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}		
    
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stk = new Stack<TreeNode>();
    	if (root == null) return res;
    	
    	while (root != null || !stk.empty()) {
    		if (root != null) {
    			res.add(root.val);
    			stk.push(root);
    			root = root.left;
    		} else {
    			TreeNode n = stk.pop();
 				root = n.right;
    		}
    	} 
    	return res;    
    }

	public static void main(String[] args) {

	}
}