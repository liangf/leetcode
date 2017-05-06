
import java.util.*;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
    	HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

    	for (int i=0; i<nums.length; ++i) {
    		int another = target - nums[i];
    		if (numsMap.containsKey(another)) {
    			res[0] = i;
    			res[1] = numsMap.get(another);
    		} else {
    			numsMap.put(nums[i], i);
    		}
    	}
    	return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
