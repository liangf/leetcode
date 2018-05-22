
import java.util.*;

public class Shuffle_an_Array {

	public class Solution {
		private int[] nums;
		private int[] randNums;
	    public Solution(int[] nums) {
            this.nums = new int[nums.length];
            this.randNums = new int[nums.length];
	    	for (int i = 0; i < nums.length; i++) {
	    		this.nums[i] = nums[i];
	    		this.randNums[i] = nums[i];
	    	}
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        return nums;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        for (int i = nums.length-1; i>0; i--) {
	        	int min = 0;
	        	int max = i+1;
	        	int randIndex = (int) (Math.random()*(max-min) + min);
	        	int tmp = randNums[i];
	        	randNums[i] = randNums[randIndex];
	        	randNums[randIndex] = tmp;
	        }
	        return randNums;
	    }
	}

	public static void main(String[] args) {

	}
}
