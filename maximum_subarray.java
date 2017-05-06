
import java.util.*;

public class maximum_subarray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i=1; i<nums.length; ++i) {
            // sum[i] = Math.max(nums[i], sum[i-1]+nums[i]);
            sum[i] = nums[i] + (sum[i-1] > 0 ? sum[i-1] : 0);
            res = Math.max(res, sum[i]);
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
