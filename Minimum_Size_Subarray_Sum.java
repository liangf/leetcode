
import java.util.*;

public class Minimum_Size_Subarray_Sum {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        int start = 0;
        int res = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                res = Math.min(res, i-start+1);
                sum -= nums[start];
                start++;
            }
        }
        return res == nums.length + 1 ? 0 : res;
    }

	public static void main(String[] args) {
        Minimum_Size_Subarray_Sum ms = new Minimum_Size_Subarray_Sum();
        int[] nums = {2,3,1,2,4,3};
        // int[] nums = {1,2,3,4,5};
        System.out.println(ms.minSubArrayLen(7, nums));
	}
}
