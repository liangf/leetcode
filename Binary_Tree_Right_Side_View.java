
import java.util.*;

public class Binary_Tree_Right_Side_View {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        help(root, res, 0);
        return res;
    }

    public void help(TreeNode root, List<Integer> res, int depth) {
        if (root == null) return;
        if (depth == res.size()) {
            res.add(root.val);
        }

        help(root.right, res, depth+1);
        help(root.left, res, depth+1);
    }

	public static void main(String[] args) {

	}
}
