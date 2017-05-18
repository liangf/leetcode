
import java.util.*;

public class restore_ip_addresses {
	
    public static List<String> restoreIpAddresses(String s) {
        List<String> item = new ArrayList<String>();
        List<String> res = new ArrayList<String>();

        // last case for "11111111111111111......111111111111", time excess limit
		if (s.length() > 12) return res;
        help(s, 0, item, res);
        return res;
    }	

    public static void help(String s, int start, List<String> item, List<String> res) {
    	if (start >= s.length() && item.size() == 4) {
    		String listString = String.join(".", item); 
    		res.add(listString);
    		return;
    	}

    	if ( start+1<=s.length() && isValid(s.substring(start, start+1)) ) {
    		item.add(s.substring(start, start+1));
    		help(s, start+1, item, res);
    		item.remove(item.size()-1);
    	}
    	if ( start+2<=s.length() && isValid(s.substring(start, start+2)) ) {
    		item.add(s.substring(start, start+2));
    		help(s, start+2, item, res);
    		item.remove(item.size()-1);
    	}
    	if ( start+3<=s.length() && isValid(s.substring(start, start+3)) ) {
    		item.add(s.substring(start, start+3));
    		help(s, start+3, item, res);
    		item.remove(item.size()-1);
    	}    	    	
    }

    public static boolean isValid(String s) {
    	if (s.charAt(0) == '0' && s.length() > 1) return false;
    	return Integer.parseInt(s) <= 255;
    }

    public static void main(String[] args) {
    	// System.out.println(restoreIpAddresses("25525511135"));

    	System.out.println(restoreIpAddresses("010010"));
    }
}