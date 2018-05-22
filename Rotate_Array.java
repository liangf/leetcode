
import java.util.*;

public class Rotate_Array {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k = k % nums.length;
        if (k == 0) return;
        swapArray(nums, 0, nums.length-1);
        swapArray(nums, 0, k-1);
        swapArray(nums, k, nums.length-1);
    }
    public void swapArray(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

	public static void main(String[] args) {

	}
}
