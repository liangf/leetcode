
import java.util.*;

public class permutations2 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> row = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        help(nums, new boolean[nums.length], row, res);
        return res;
    }

    public static void help(int[] nums, boolean[] visited, List<Integer> row, List<List<Integer>> res) {
        if (row.size() == nums.length) {
            res.add(new ArrayList<Integer>(row));
            return;
        }

        for (int i=0; i<nums.length; ++i) {
            if (visited[i] || (i>0 && !visited[i-1] && nums[i] == nums[i-1])) {
                continue;
            }
            visited[i] = true;
            row.add(nums[i]);
            help(nums, visited, row, res);
            row.remove(row.size()-1);
            visited[i] = false;
        }
    }

	public static void main(String[] args) {

		System.out.println("hello");
        int[] nums = {1, 1, 2};

        List<List<Integer>> res = permuteUnique(nums);
        for (int i=0; i<res.size(); ++i) {
            for (int j=0; j<res.get(i).size(); ++j) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
	}
}
