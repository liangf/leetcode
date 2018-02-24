


import java.util.*;

public class Longest_Increasing_Subsequence {


    // public int lengthOfLIS(int[] nums) {
    //     if (nums == null || nums.length == 0) return 0;
    //     int n = nums.length;
    //     int[] tail = new int[n];
    //     tail[0] = nums[0];

    //     int len = 1;
    //     for (int i = 1; i < n; i++) {
    //     	int l = 0;
    //     	int h = len - 1;
    //     	while (l < h) {
    //     		int mid = l + (h-l)/2;
    //     		if (tail[mid] >= nums[i]) {
    //     			h = mid;
    //     		} else {
    //     			l = mid + 1;
    //     		}
    //     	}
    //     	if (nums[i] < tail[l]) tail[l] = nums[i];
    //     	if (nums[i] > tail[l]) {
    //     		tail[++h] = nums[i];
    //     		len++;
    //     	}
    //     } 
    // 	return len;    
    // }

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
 		int[] dp = new int[nums.length];
 		dp[0] = 1;
        int res = 1;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
 			for (int j = 0; j < i; j++) {
 				if (nums[j] < nums[i]) {
 					dp[i] = Math.max(dp[i], dp[j] + 1);
 				}
                res = Math.max(res, dp[i]);
 			}
        } 
    	return res;    
    }
    
	
	public static void main(String[] args) {

	}	
}