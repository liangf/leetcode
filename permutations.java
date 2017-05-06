
import java.util.*;

public class permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> row = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        help(nums, 0, row, res);
        return res;        
    }

    public static void help(int[] nums, int pos, List<Integer> row, List<List<Integer>> res) {
        if (row.size() == nums.length) {
            res.add(new ArrayList<Integer>(row));
            return;
        }

        for (int i=0; i<nums.length; ++i) {
            if (row.contains(nums[i])) {
                continue;
            }
            row.add(nums[i]);
            help(nums, pos+1, row, res);
            row.remove(row.size()-1);
        }
    }

	public static void main(String[] args) {

		System.out.println("hello");
        int[] nums = {1, 2, 3};

        List<List<Integer>> res = permute(nums);
        for (int i=0; i<res.size(); ++i) {
            for (int j=0; j<res.get(i).size(); ++j) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
	}
}
