
import java.util.*;

public class combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> item = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        help(n, k, 1, item, res);
        return res;
    }

    public static void help(int n, int k, int start, List<Integer> item, List<List<Integer>> res) {
    	if (item.size() == k) {
    		res.add(new ArrayList<Integer>(item));
    		return;
    	}

    	for (int i=start; i<=n; ++i) {
    		item.add(i);
    		help(n, k, i+1, item, res);
    		item.remove(item.size()-1);
    	}
    }	

	public static void main(String[] args) {

		List<List<Integer>> res = combine(4, 2);

		System.out.println(res);
	}
}