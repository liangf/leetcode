


public class best_time_to_buy_and_sell_stock2 {

    public static int maxProfit(int[] prices) {
    	if (prices == null || prices.length <= 1) return 0;
        int res = 0;

        for (int i=1; i<prices.length; ++i) {
 			if (prices[i] > prices[i-1]) {
 				res += prices[i] - prices[i-1];
 			}
        }
        return res;
    }	

    public static void main(String[] args) {
    	int[] prices = {7, 1, 5, 3, 6, 4};

    	System.out.println(maxProfit(prices));
    }
}