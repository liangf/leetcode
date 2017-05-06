
import java.util.*;

public class search_insert_position {

    public int searchInsert(int[] nums, int target) {
    	int left = 0, right = nums.length - 1;

    	while (left <= right) {
    		int mid = left + (right - left)/2;
    		if (nums[mid] == target) {
    			return mid;
    		} else if (nums[mid] > target) {
    			right = mid;
    		} else {
    			left = mid;
    		}
    	}

    	return -1;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
