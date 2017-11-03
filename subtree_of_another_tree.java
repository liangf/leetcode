


public class subtree_of_another_tree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }	
  
  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (s == null) return t == null;
    if (s.val == t.val) {
      if (help(s, t)) return true;
    }
    return isSubtree(s.left, t) || isSubtree(s.right, t);
  }

  public boolean help(TreeNode s, TreeNode t) {
    if (s == null) return t == null;
    if (t == null) return s == null;
    if (s.val != t.val) return false;
    return help(s.left, t.left) && help(s.right, t.right);
  }

	public static void main(String[] args) {

	}
}