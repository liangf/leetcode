
import java.util.*;

public class first_missing_positive {

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        for (; i<nums.length;) {
            int j = nums[i] - 1;
            if (nums[i] != i+1 && nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[j]) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            } else {
                ++i;
            } 
        }
        i = 0;
        for (; i<nums.length; ++i) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return i+1;
    }


	public static void main(String[] args) {

		System.out.println("hello");

        // int[] nums = {3,4,-1,1};
        int[] nums = {0,1,2};

        System.out.println(firstMissingPositive(nums));
	}
}
