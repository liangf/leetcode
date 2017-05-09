import java.util.*;


public class sort_colors {
    
    public void sortColors(int[] nums) {
    	int left = 0;
    	int right = nums.length-1;

    	int i = 0;
    	while (i <= right) {
    		if (nums[i] == 0) {
    			swap(nums, i, left);
    			++left;
    			++i;
    		} else if (nums[i] == 2) {
    			swap(nums, i, right);
    			--right;
    		} else {
    			++i;
    		}
    	}
    }	

    public void swap(int[] nums, int a, int b) {
    	int tmp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = tmp;
    }

	public static void main(String[] args) {
		int[] nums = {0,1,2,0,1,2};

		System.out.println(Arrays.toString(nums));

		sortColors(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("jajja");
	}
}