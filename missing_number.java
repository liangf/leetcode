

public class missing_number {
	
    public int missingNumber(int[] nums) {
    	int sum = 0, nSum = 0;
    	int missing = 0;
		
		for (int i=0; i<nums.length; ++i) {
			nSum += i;
			sum += nums[i];
		}

		nSum += nums.length;
		return nSum - sum;        
    }

	public static void main(String[] args) {

	}
}