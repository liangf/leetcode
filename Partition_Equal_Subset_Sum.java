import java.util.*;

public class Partition_Equal_Subset_Sum {

    public boolean canPartition(int[] nums) {
    	int sum = 0, n = nums.length;

    	for (int i = 0; i < nums.length; i++) {
    		sum += nums[i];
    	}
    	if (sum % 2 == 1) return false;

    	int[][] dp = new int[n+1][sum+1];
    	for (int j = 0; j <= sum; j++) {
    		dp[0][j] = 0;
    	}
    	for (int i = 1; i <= n; i++) {
            int k = nums[i-1];
    		for (int j = k; j <= sum; j++) {
    			dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-k]+k);
    		}
    	}
    	if (dp[n][sum/2] == sum/2) return true;
    	return false;    
    }
	
	public static void main(String[] args) {

	}	
}