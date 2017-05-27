


public class single_number {
	
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i=1; i<nums.length; ++i) {
        	res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}