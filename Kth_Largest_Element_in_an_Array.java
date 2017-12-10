


public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        return help(nums, k-1, 0, nums.length-1);
    }

    public int help(int[] nums, int k, int left, int right) {
    	int index = getPartition(nums, left, right);
		if (index == k) {
			return nums[index];
		} else if (index > k) {
			return help(nums, k, left, index-1);
		} else {
			return help(nums, k, index+1, right);
		}
    }	

    public int getPartition(int[] nums, int left, int right) {
        int start = left;
        left = left + 1;
    	while (left <= right) {
    		if (nums[left] <= nums[start] && nums[right] > nums[start]) {
    			swap(nums, left, right);
    		}
    		if (nums[left] > nums[start]) {
    			left++;
    		}
    		if (nums[right] <= nums[start]) {
    			right--;
    		}
    	}
    	swap(nums, start, right);
    	return right;
    }

    public void swap(int[] nums, int a, int b) {
    	int tmp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = tmp;
    }

	public static void main(String[] args) {

	}
}