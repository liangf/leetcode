
import java.util.*;

public class Flatten_Nested_List_Iterator {
	public interface NestedInteger {
	
		// @return true if this NestedInteger holds a single integer, rather than a nested list.
		public boolean isInteger();
	
		// @return the single integer that this NestedInteger holds, if it holds a single integer
		// Return null if this NestedInteger holds a nested list
		public Integer getInteger();
	
		// @return the nested list that this NestedInteger holds, if it holds a nested list
		// Return null if this NestedInteger holds a single integer
		public List<NestedInteger> getList();
	}

	public class NestedIterator implements Iterator<Integer> {

		Stack<NestedInteger> stk;
	    public NestedIterator(List<NestedInteger> nestedList) {
	        stk = new Stack<NestedInteger>();
	        for (int i = nestedList.size()-1; i >= 0; i--) {
	        	stk.push(nestedList.get(i));
	        }
	    }

	    @Override
	    public Integer next() {
	       return stk.pop().getInteger();
	    }

	    @Override
	    public boolean hasNext() {
	    	while (!stk.isEmpty()) {
	    		if (stk.peek().isInteger()) {
	    			return true;
	    		} else {
	    			List<NestedInteger> tmp = stk.pop().getList();
	    			for (int i=tmp.size()-1; i>=0; i--) {
	    				stk.push(tmp.get(i));
	    			}
	    		}
	    	}
	    	return false;
	    }
	}

	public static void main(String[] args) {

	}
}
