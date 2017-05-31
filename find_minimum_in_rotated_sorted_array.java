


public class find_minimum_in_rotated_sorted_array {
    
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
        	int mid = left + (right-left)/2;
        	if (nums[mid] > nums[right]) {
        		left = mid + 1;
        	} else {
        		if (nums[mid] >= nums[left]) {
        			return nums[left];
        		} else {
        			right = mid;
        		}
        	}
        }
        return -1;
    }

	public static void main(String[] args) {

	}
}