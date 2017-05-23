
import java.util.*;

public class pascal_triangle {
	
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (numRows <= 0) return res;

    	res.add(Arrays.asList(1));
    	for (int i=1; i<numRows; ++i) {
    		List<Integer> item = new ArrayList<Integer>();
    		item.add(1);
    		for (int j=1; j<i; ++j) {
    			int a = res.get(i-1).get(j-1);
    			int b = res.get(i-1).get(j);
    			item.add(a + b);
    		}
    		item.add(1);
    		res.add(item);
    	}
    	return res;
    }

	public static void main(String[] args) {

		System.out.println( generate(3) );
	}
}