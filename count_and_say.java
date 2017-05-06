
import java.util.*;

public class count_and_say {

    public static String countAndSay(int n) {
    	if (n <= 0) {
    		return "";
    	}

    	String res = "1";

    	for (int j=2; j<=n; ++j) {
    		int count = 0;
    		StringBuilder sb = new StringBuilder();
 	    	for (int i=0; i<res.length(); ++i) {
	    		if (i-1>=0 && res.charAt(i) != res.charAt(i-1)) {
	    			sb.append(count);
	    			sb.append(res.charAt(i-1));
	    			count = 1;
	    		} else {
	    			++count;
	    		}
	    	}
	    	sb.append(count);
	    	sb.append(res.charAt(res.length()-1));
	    	res = sb.toString();   		
    	}
    	return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

		System.out.println(countAndSay(3));
	}
}
