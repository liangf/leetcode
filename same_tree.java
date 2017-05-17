


public class same_tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}

    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if (p==null && q!=null) return false;
    	if (p!=null && q==null) return false;
    	if (p == null && q == null) return true;
    	if (p.val != q.val) return false;

    	boolean left = isSameTree(p.left, q.left);
    	boolean right = isSameTree(p.right, q.right);    
    	return left && right; 
    }

	public static void main(String[] args) {

	}
}