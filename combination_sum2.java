
import java.util.*;

public class combination_sum2 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<Integer> row = new ArrayList<Integer>();
    	List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
    	help(candidates, target, 0, row, res);
    	return res;
    }

    public static void help(int[] candidates, int target, int pos, List<Integer> row, List<List<Integer>> res) {
    	if (target == 0) {
    		res.add(new ArrayList<Integer>(row));
    		return;
    	}

    	for (int i=pos; i<candidates.length; ++i) {
            if (i-1>=pos && candidates[i] == candidates[i-1]) {
                continue;
            }
    		if (candidates[i] <= target) {
    			row.add(candidates[i]);
    			help(candidates, target-candidates[i], i+1, row, res);
    			row.remove(row.size()-1);
    		}
    	}
    }

    public static void test(int[] candidates) {
    	candidates[0] = 99;
    }

	public static void main(String[] args) {

		System.out.println("hello");

		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		List<List<Integer>> res = combinationSum(candidates, 8);

		System.out.println("res" + res.size());
		for (int i=0; i<res.size(); ++i) {
			for (int j=0; j<res.get(i).size(); ++j) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
