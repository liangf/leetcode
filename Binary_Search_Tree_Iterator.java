
import java.util.*;

public class Binary_Search_Tree_Iterator {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
public class BSTIterator {

    private Stack<TreeNode> stk;
    public BSTIterator(TreeNode root) {
        stk = new Stack<TreeNode>();
        while (root != null) {
            stk.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stk.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = stk.pop();
        TreeNode p = tmp.right;
        while (p != null) {
            stk.push(p);
            p = p.left;
        }
        return tmp.val;
    }
}

	public static void main(String[] args) {

	}
}
