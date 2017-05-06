
import java.util.*;

public class remove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int pre = 0;
        for (int i=1; i<nums.length; ++i) {
            if (nums[i] != nums[i-1]) {
                ++pre;
                nums[pre] = nums[i];
            } 
        }   
        return pre + 1;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
