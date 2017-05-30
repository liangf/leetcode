
import java.util.*;

public class binary_tree_postorder_traversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public List<Integer> postorderTraversal(TreeNode root) {
    	Stack<TreeNode> stk = new Stack<TreeNode>();
        LinkedList<Integer> res = new LinkedList<Integer>();
    	if (root == null) return res;

    	stk.push(root);
    	while (!stk.empty()) {
    		TreeNode n = stk.pop();
    		res.addFirst(n.val);
    		if (n.left != null) {
    			stk.push(n.left);
    		}
    		if (n.right != null) {
    			stk.push(n.right);
    		}
    	}
    	return res;
    }

	public static void main(String[] args) {

	}
}