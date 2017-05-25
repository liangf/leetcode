
import java.util.*;

public class palindrome_partitioning {
	
    public List<List<String>> partition(String s) {
    	List<String> item = new ArrayList<String>();
    	List<List<String>> res = new ArrayList<List<String>>();
	        
		help(s, 0, item, res); 
		return res;
    }

    public void help(String s, int start, List<String> item, List<List<String>> res) {
    	if (start >= s.length()) {
    		res.add(new ArrayList<String>(item));
    		return;
    	}

    	for (int i=start; i<s.length(); ++i) {
    		if (isPalindrome(s, start, i)) {
    			item.add(s.substring(start, i+1));
    			help(s, i+1, item, res);
    			item.remove(item.size()-1);
    		}
    	}
    }

    public boolean isPalindrome(String s, int start, int end) {
    	while (start < end) {
    		if (s.charAt(start++) != s.charAt(end--)) {
    			return false;
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {

	}
}