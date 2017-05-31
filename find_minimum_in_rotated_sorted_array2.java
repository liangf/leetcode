


public class find_minimum_in_rotated_sorted_array2 {
    
    public int findMin(int[] nums) {
        int res = nums[0];
        for (int i=1; i<nums.length; ++i) {
            if (nums[i] < res) {
                res = nums[i];
            }
        }
        return res;
    }

	public static void main(String[] args) {

	}
}