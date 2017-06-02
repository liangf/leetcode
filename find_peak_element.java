


public class find_peak_element {
	
    public int findPeakElement(int[] nums) {
    	if (nums == null || nums.length == 0) return -1;
    	if (nums.length <= 1) return 0;
    	
    	for (int i=0; i<nums.length; ++i) {
    		if (i == 0) {
    			if (nums[i] > nums[i+1]) return i;
    		} else if (i == nums.length - 1) {
    			if (nums[i] > nums[i-1]) return i;
    		} else if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
    			return i;
    		}
    	}    
    	return -1;
    }

	public static void main(String[] args) {

	}
}