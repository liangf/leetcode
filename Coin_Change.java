


import java.util.*;

public class Coin_Change {


    public int coinChange(int[] coins, int amount) {
    	int[] dp = new int[amount+1];
    	dp[0] = 0;
    	for (int i = 1; i <= amount; i++) {
    		dp[i] = amount + 1;
    		for (int j = 0; j < coins.length; j++) {
    			if (i >= coins[j]) {
    				dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
    			}
    		}
    	}
    	return dp[amount] > amount ? -1 : dp[amount];      
    }

    
	
	public static void main(String[] args) {

	}	
}