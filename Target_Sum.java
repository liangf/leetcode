
import java.util.*;

public class Target_Sum {
	
    public int findTargetSumWays(int[] nums, int S) {
      int sum = 0;
      for (int i = 0; i < nums.length; i++)
        sum += nums[i];
      if ((S + sum) % 2 == 1 || S > sum || S < -1*sum) return 0;
        
      int[] dp = new int[sum+1];
      dp[0] = 1;
      for (int i = 0; i < nums.length; i++) {
            for (int w = sum; w >= nums[i]; w--) {
              dp[w]  = dp[w] + dp[w - nums[i]];
            }
      }   
      return dp[(S+sum)/2];
    }

    // public int help(int[] nums, int S, int start, int sum) {
    // 	if (start == nums.length) {
    // 		if (sum == S) return 1;
    // 		return 0;
    // 	}

    // 	int left = help(nums, S, start+1, sum+nums[start]);
    // 	int right = help(nums, S, start+1, sum-nums[start]);
    // 	return left + right;
    // }

    // private Map<String, Integer> map = new HashMap<>();
    // public int help(int[] nums, int S, int start, int sum) {
    // 	if (start == nums.length) {
    // 		if (sum == S) return 1;
    // 		return 0;
    // 	}
    // 	String encodeString = start + "::" + sum;
    // 	if (map.containsKey(encodeString)) return map.get(encodeString);

    // 	int left = help(nums, S, start+1, sum+nums[start]);
    // 	int right = help(nums, S, start+1, sum-nums[start]);
    // 	map.put(encodeString, left+right);
    // 	return left + right;
    // }

	public static void main(String[] args) {

	}
}