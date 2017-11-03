
public class majority_element {
	
    public int majorityElement(int[] nums) {
    	int majority = nums[0];
    	int count = 1;
    	for (int i=1; i<nums.length; ++i) {
    		if (nums[i] == majority) {
    			count++;
    		} else {
    			count--;
    			if (count == 0) {
    				majority = nums[i];
    				count = 1;
    			}
    		}
    	}
    	count = 0;
    	for (int i=0; i<nums.length; ++i) {
    		if (nums[i] == majority) 
    			count++;
    	} 
    	if (count > nums.length/2) 
    		return majority;
    	return -1;
    }
    
	public static void main(String[] args) {
		majority_element me = new majority_element();
		int a[] = {3, 3, 4};
		me.majorityElement(a);
	}
}