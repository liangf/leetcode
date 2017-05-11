
import java.util.*;


public class subsets {
	
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> item = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        help(nums, 0, item, res);
        return res;
    }

    public static void help(int[] nums, int start, List<Integer> item, List<List<Integer>> res) {
    	if (item.size() > nums.length) {
    		return;
    	} else {
			res.add(new ArrayList<Integer>(item));    		
    	}

    	for (int i=start; i<nums.length; ++i) {
    		item.add(nums[i]);
    		help(nums, i+1, item, res);
    		item.remove(item.size()-1);
    	}
    }

	public static void main(String[] args) {

		int[] nums = {1, 2, 3};
		List<List<Integer>> res= subsets(nums);

		System.out.println(res);
	}
}