


public class Product_of_Array_Except_Self {
	
    public int[] productExceptSelf(int[] nums) {
     	int[] dp = new int[nums.length];
     	dp[0] = 1;

     	for (int i = 1; i < nums.length; i++) {
     		dp[i] = dp[i-1] * nums[i-1 ];
     	}

     	int tmp = 1;
     	for (int i = nums.length-2; i >=0; i--) {
     		tmp = tmp * nums[i+1];
     		dp[i] = dp[i] * tmp;
     	}
     	return dp;
    }

	public static void main(String[] args) {

	}
}