
import java.util.*;

public class three_sum_closest {

    public static int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int left=0; left<nums.length-2; ++left) {
            int mid = left + 1;
            int right = nums.length-1;
            while (mid < right) {
                int sum = nums[left] + nums[mid] + nums[right];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    ++mid;
                } else {
                    --right;
                }
                if (Math.abs(sum) < Math.abs(res)) {
                    res = sum;
                }                
            }
        }
        return res;   
    }

	public static void main(String[] args) {
		System.out.println("hello");

        int[] nums = {-1, 0, 1, 2, -1, -4}; 

        System.out.println(threeSumClosest(nums, 1));
	}
}
