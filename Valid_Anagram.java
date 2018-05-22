
import java.util.*;

public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
        	if (!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), 1);
        	} else {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        }
        for (int i = 0; i < t.length(); i++) {
       		if (map.containsKey(t.charAt(i))) {
       			int count = map.get(t.charAt(i));
       			if (count > 1) map.put(t.charAt(i), count-1);
       			else if (count == 1) map.remove(t.charAt(i));
       			else return false;
       		}
        }
        return map.size() == 0;  
    }

	public static void main(String[] args) {

	}
}
