
import java.util.*;

public class House_Robber2 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(help(nums, 0, nums.length-2), help(nums, 1, nums.length-1)); 
    }

    public int help(int[] nums, int start, int end) {
       int a = 0, b = 0;
        for (int i = start; i <= end; i++) {
            int c = Math.max(a+nums[i], b);
            a = b; 
            b = c; 
        }
        return Math.max(a, b);
    }

	public static void main(String[] args) {

	}
}
