
import java.util.*;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        int minVal = Math.min(p.val, q.val);
        int maxVal = Math.max(p.val, q.val);
        if (root.val > maxVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < minVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

	public static void main(String[] args) {

	}
}
