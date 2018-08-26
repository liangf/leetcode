
import java.util.*;

public class Combination_Sum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> row = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        help(k, n, 1, row, res);
        return res;
    }

    public void help(int k, int sum, int step, List<Integer> row, List<List<Integer>> res) {
        if (k == 0) {
            if (sum == 0) res.add(new ArrayList<Integer>(row));
            // System.out.println(row);
            return;
        }

        // System.out.println(row);
        // System.out.println("step::" + step);
        for (int i = step; i <= 9; i++) {
            row.add(i);
            help(k-1, sum-i, i+1, row, res);
            // System.out.println("help::" + row);
            row.remove(row.size()-1);
        }
    }

	public static void main(String[] args) {
        Combination_Sum3 cs = new Combination_Sum3();
        List<List<Integer>> res = cs.combinationSum3(3, 7);
        System.out.println(res);
	}
}
