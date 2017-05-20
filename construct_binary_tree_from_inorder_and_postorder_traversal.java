


public class construct_binary_tree_from_inorder_and_postorder_traversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;
        return help(postorder, inorder, postorder.length-1, 0, inorder.length-1);
    }

    public static TreeNode help(int[] postorder, int[] inorder, int lastIndex, int start, int end) {
    	if (start > end) return null;

    	TreeNode root = new TreeNode(postorder[lastIndex]);
    	int mid = getArrayIndex(inorder, postorder[lastIndex]);

    	root.left = help(postorder, inorder, lastIndex-end+mid-1, start, mid-1);
    	root.right = help(postorder, inorder, lastIndex-1, mid+1, end);
    	return root;
    }

    public static int getArrayIndex(int[] arr, int value) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value) return i; 
        }
    	return -1;
    }
}