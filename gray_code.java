
import java.util.*;

public class gray_code {

    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        if (n == 0) {
        	return res;
        }
        res.add(1);
        if (n == 1) {
        	return res;
        }
        
        for (int j=2; j<=n; ++j) {
        	int len = res.size();
        	for (int i=len-1; i>=0; --i) {
        		int a = res.get(i) | 1<<(j-1);
        		res.add(a);
        	}
        }
        return res;
    }
    	
	public static void main(String[] args) {

		System.out.println(grayCode(3));
	}
}