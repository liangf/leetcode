


public class convert_sorted_array_to_binary_search_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return help(nums, 0, nums.length-1);
    }

    public TreeNode help(int[] nums, int start, int end) {
    	if (start > end) return null;
    	int mid = start + (end-start)/2;

    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = help(nums, start, mid-1);
    	root.right = help(nums, mid+1, end);
    	return root;
    }

	public static void main(String[] args) {

	}
}