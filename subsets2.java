
import java.util.*;

public class subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> item = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        help(nums, 0, item, res);
        return res;
    }

    void help(int[] nums, int start, List<Integer> item, List<List<Integer>> res) {
        res.add(new ArrayList<Integer>(item));

        for (int i=start; i<nums.length; ++i) {
            if (i != start && nums[i] == nums[i-1]) continue;
            item.add(nums[i]);
            help(nums, i+1, item, res);
            item.remove(item.size()-1);
        }
    }   

	public static void main(String[] args) {

	}
}