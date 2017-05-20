
import java.util.*;

public class construct_binary_tree_from_preorder_and_inorder_traversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        return help(preorder, inorder, 0, 0, inorder.length-1);
    }

    public static TreeNode help(int[] preorder, int[] inorder, int preIndex, int start, int end) {
    	if (start > end) return null;

    	TreeNode root = new TreeNode(preorder[preIndex]);
    	int mid = getArrayIndex(inorder, preorder[preIndex]);

    	root.left = help(preorder, inorder, preIndex+1, start, mid-1);
    	root.right = help(preorder, inorder, preIndex+mid-start+1, mid+1, end);
    	return root;
    }

    public static int getArrayIndex(int[] arr, int value) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value) return i; 
        }
    	return -1;
    }

    public static void main(String[] args) {
    	int[] preorder = new int[] {-1};
    	int[] inorder = new int[] {-1};

    	TreeNode root = buildTree(preorder, inorder);
    }
}