
import java.util.*;

public class longest_consecutive_sequence {

    public int longestConsecutive(int[] nums) {
    	int res = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (int i=0; i<nums.length; ++i) {
        	set.add(nums[i]);
        }

        for (int i=0; i<nums.length; ++i) {
       		int count = 1;
       		// left
       		int left = nums[i]-1;
       		while ( set.contains(left) ) {
       			set.remove(left--);
       			++count;
       		}
       		// right
       		int right = nums[i] + 1;
       		while ( set.contains(right) ) {
       			set.remove(right++);
       			++count;
       		}
       		res = Math.max(count, res);
        }
        return res;
    }	

    public static void main(String[] args) {

    }
}