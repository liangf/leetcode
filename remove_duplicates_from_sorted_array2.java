
import java.util.*;

public class remove_duplicates_from_sorted_array2 {

    public int removeDuplicates(int[] nums) {
        int pre = 0, cur = 0, count = 0;

        while (cur < nums.length) {
        	if (cur>0 && nums[cur] == nums[cur-1]) {
        		++count;
        		if (count <= 2) {
        			nums[pre++] = nums[cur];
        		}
        	} else {
        		count = 1;
        		nums[pre++] = nums[cur];
        	}
        	++cur;
        } 
        return pre;
    }

	public static void main(String[] args) {

	}
}