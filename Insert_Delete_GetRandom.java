
import java.util.*;

public class Insert_Delete_GetRandom {

	public class RandomizedSet {

		private List<Integer> list;
		private Map<Integer, Integer> map;
	    /** Initialize your data structure here. */
	    public RandomizedSet() {
	        list = new ArrayList<Integer>();
	        map = new HashMap<Integer, Integer>();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if (map.containsKey(val)) return false;
	        list.add(val);
	        map.put(val, list.size()-1);
	        return true;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if (!map.containsKey(val)) return false;
	  		int index = map.get(val);
	  		int lastVal = list.get(list.size()-1);
	        Collections.swap(list, index, list.size()-1);
	        map.put(lastVal, index);
	        list.remove(list.size()-1);
	        map.remove(val);
	        return true;
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	    	int min = 0;
	    	int max = list.size();
	    	int i = (int) (Math.random() * (max-min) + min);
	    	return list.get(i);
	    }

	}

	public static void main(String[] args) {

	}
}
