


import java.util.*;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {


    public int maxProfit(int[] prices) {
    	int n = prices.length;
        int[] rest = new int[n+1];
        int[] hold = new int[n+1];
        int[] sold = new int[n+1];
        rest[0] = 0;
        sold[0] = 0;
        hold[0] = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
        	hold[i] = Math.max(rest[i-1]-prices[i-1], hold[i-1]);
        	sold[i] = hold[i-1]+prices[i-1];
        	rest[i] = Math.max(rest[i-1], sold[i-1]);
        }
        return Math.max(sold[n], rest[n]);
    }

    
	
	public static void main(String[] args) {

	}	
}