
import java.util.*;

public class group_anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	Map<String, List<String>> hmap = new HashMap<String, List<String>>();

    	for (int i=0; i<strs.length; ++i) {
    		String origin = strs[i];
    		char[] chars = origin.toCharArray();
    		Arrays.sort(chars);
    		String sorted = new String(chars);
    		if (!hmap.containsKey(sorted)) {
    			hmap.put(sorted, new ArrayList<String>(Arrays.asList(origin)));
    		} else {
    			hmap.get(sorted).add(origin);
    		}
    	}

    	for (String key : hmap.keySet()) {
    		res.add(hmap.get(key));
    	}   
    	return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

		List<List<String>> res = groupAnagrams(strs);
		for (int i=0; i<res.size(); ++i) {
			for (int j=0; j<res.get(i).size(); ++j) {
				System.out.print(res.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
