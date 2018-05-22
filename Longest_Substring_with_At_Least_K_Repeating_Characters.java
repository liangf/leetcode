
import java.util.*;

public class Longest_Substring_with_At_Least_K_Repeating_Characters {

    public int longestSubstring(String s, int k) {
        return help(s, k, 0, s.length());
    }

    int help(String s, int k, int start, int end) {
    	if (end - start < k) return 0;

    	int[] count = new int[26];
    	for (int i = start; i < end; i++) {
    		count[s.charAt(i)-'a']++;
    	}
    	for (int i = start; i < end; i++) {
    		if (count[s.charAt(i)-'a'] < k) {
    			int left = help(s, k, start, i);
    			int right = help(s, k, i+1, end);
    			return Math.max(left, right);
    		}
    	}
    	return end - start;
    }

	public static void main(String[] args) {

		Longest_Substring_with_At_Least_K_Repeating_Characters ls = new Longest_Substring_with_At_Least_K_Repeating_Characters();
		System.out.println(ls.longestSubstring("aaabb", 3));
	}
}
