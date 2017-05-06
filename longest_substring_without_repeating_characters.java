
import java.util.*;

public class longest_substring_without_repeating_characters {

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int j = 0;
        for (int i=0; i<s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }

        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
