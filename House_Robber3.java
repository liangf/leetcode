


import java.util.*;

public class House_Robber3 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    // public int rob(TreeNode root) {
    //     if (root == null) return 0;

    //     int val = 0;
    //     if (root.left != null) {
    //         val += rob(root.left.left) + rob(root.left.right);
    //     }
    //     if (root.right != null) {
    //         val += rob(root.right.left) + rob(root.right.right);
    //     }
    //     return Math.max(root.val+val, rob(root.left)+rob(root.right));
    // }

    // private Map<TreeNode, Integer> map = new HashMap<>();
    // public int rob(TreeNode root) {
    //     if (root == null) return 0;
    //     if (map.containsKey(root)) return map.get(root);

    //     int val = 0;
    //     if (root.left != null) {
    //         val += rob(root.left.left) + rob(root.left.right);
    //     }
    //     if (root.right != null) {
    //         val += rob(root.right.left) + rob(root.right.right);
    //     }

    //     int res = Math.max(root.val+val, rob(root.left)+rob(root.right));
    //     map.put(root, res);
    //     return res;
    // }


    public int rob(TreeNode root) {
        int[] res = help(root);
        return Math.max(res[0], res[1]);
    }

    public int[] help(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = help(root.left);
        int[] right = help(root.right);

        int[] res = new int[2];
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }


	public static void main(String[] args) {
        int[] aa = new int[2];
        System.out.println(aa[0]);
        System.out.println(aa[1]);
	}	
}