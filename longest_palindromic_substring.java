
import java.util.*;

public class longest_palindromic_substring {

    public static String longestPalindrome(String s) {
        String res = "";
        for (int i=0; i<s.length(); ++i) {
        	int left = i;
        	int right = i;
        	while (left >=0 && right < s.length()) {
        		if (s.charAt(left) == s.charAt(right)) {
        			--left;
        			++right;
        		} else {
        			break;
        		}
        	}
        	if (right - left - 1 > res.length()) {
        		res = s.substring(left+1, right);
        	}
        	left = i;
        	right = i + 1;
        	while (left >= 0 && right < s.length()) {
        		if (s.charAt(left) == s.charAt(right)) {
        			--left;
        			++right;
        		} else {
        			break;
        		}        		
        	}
        	if (right - left - 1 > res.length()) {
        		res = s.substring(left+1, right);
        	}        	
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(longestPalindrome("babad"));
	}
}
