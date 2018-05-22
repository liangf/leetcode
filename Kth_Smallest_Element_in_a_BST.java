
import java.util.*;

public class Kth_Smallest_Element_in_a_BST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int kthSmallest(TreeNode root, int k) {
        int n = count(root.left);
        if (k <= n) return kthSmallest(root.left, k);
        else if (k > n + 1) return kthSmallest(root.right, k - n - 1);
        return root.val;
    }
    public int count(TreeNode root) {
        if (root == null) return 0;
        return count(root.left) + count(root.right) + 1;
    }

	public static void main(String[] args) {

	}
}
