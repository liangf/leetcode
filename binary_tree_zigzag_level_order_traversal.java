
import java.util.*;

public class binary_tree_zigzag_level_order_traversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}	

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     	Queue<TreeNode> que = new LinkedList<TreeNode>();
     	List<List<Integer>> res = new ArrayList<List<Integer>>();

     	int level = 0;
     	que.offer(root);
     	while ( !que.isEmpty() && root != null ) {
     		Queue<TreeNode> tmp = new LinkedList<TreeNode>();
     		List<Integer> item = new ArrayList<Integer>();
     		while ( !que.isEmpty() ) {
     			TreeNode n = que.poll();
     			if (level % 2 == 0) {
     				item.add(n.val);
     			} else {
     				item.add(0, n.val);
     			}
     			if (n.left != null) {
     				tmp.offer(n.left);
     			}
     			if (n.right != null) {
     				tmp.offer(n.right);
     			}
     		}
     		++level;
     		res.add(item);
     		que = tmp;
     	}
     	return res;  
    }	

    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	root.left.left = new TreeNode(4);
    	root.right.right = new TreeNode(5);


    	System.out.println(zigzagLevelOrder(root));
    }
}