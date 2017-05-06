
import java.util.*;

public class search_for_a_range {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = {-1, -1};
        
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        res[0] = (right+1<nums.length && nums[right+1]==target) ? right+1 : -1;

        left = 0;
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        res[1] = (left-1>=0 && nums[left-1]==target) ? left - 1 : -1;

        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
