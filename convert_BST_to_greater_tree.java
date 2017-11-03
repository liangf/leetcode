


public class convert_BST_to_greater_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }	
  
    public TreeNode convertBST(TreeNode root) {
      help(root);
      return root;  
    }

    TreeNode parent = null;
    public boolean help(TreeNode root) {
      if (root == null) return;

      help(root.right);
      root.val = root.val + (parent != null ? parent.val : 0); 
      parent = root;
      help(root.left); 
    }

  	public static void main(String[] args) {

  	}
}