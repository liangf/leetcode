
import java.util.*;

public class maximum_product_subarray {
    
    public int maxProduct(int[] nums) {
    	int min = nums[0], max = nums[0], res = nums[0];

    	for (int i=1; i<nums.length; ++i) {
    		if (nums[i] > 0) {
    			min = Math.min(nums[i], nums[i]*min);
    			max = Math.max(nums[i], nums[i]*max);
    		} else if (nums[i] < 0) {
    			int tmp = nums[i] * min;
    			min = Math.min(nums[i], nums[i]*max);
    			max = Math.max(nums[i], tmp);
    		} else {
    			min = 0;
    			max = 0;
    		}
    		res = Math.max(res, max);
    	}
    	return res;
    }

	public static void main(String[] args) {

	}
}