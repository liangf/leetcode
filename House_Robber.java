


public class House_Robber {

    public int rob(int[] nums) {
    	int[] dp = new int[nums.length];
    	dp[0] = nums[0];

    	for (int i = 1; i < nums.length; i++) {
    		dp[i] = Math.max(nums[i], dp[i-1]);
    		for (int j = 0; j <= i-2; j++) {
    			dp[i] = Math.max(dp[i], dp[j]+nums[i]);
    		} 
    	}
    	return dp[nums.length-1];
    }

	public static void main(String[] args) {

	}	
}