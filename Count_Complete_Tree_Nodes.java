
import java.util.*;

public class Count_Complete_Tree_Nodes {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

    public int countNodes(TreeNode root) {
    	if (root == null) return 0;
        int left = leftHeight(root.left);
        int right = rightHeight(root.right);
        if (left == right) return (1 << left+1) - 1;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int leftHeight(TreeNode root) {
    	int h = 0;
    	while (root != null) {
    		h++;
    		root = root.left;
    	}
    	return h;
    }

    public int rightHeight(TreeNode root) {
    	int h = 0;
    	while (root != null) {
    		h++;
    		root = root.right;
    	}
    	return h;
    }

	public static void main(String[] args) {

	}
}
