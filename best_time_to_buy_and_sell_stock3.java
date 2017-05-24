


public class best_time_to_buy_and_sell_stock3 {

    public static int maxProfit(int[] prices) {
    	if (prices == null || prices.length <= 1) return 0;
        int res = 0, min = prices[0], max = prices[prices.length-1]; 
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        left[0] = 0;
        for (int i=1; i<prices.length; ++i) {
            if (prices[i] < min) {
                min = prices[i];
            }
            left[i] = Math.max(left[i-1], prices[i]-min);
        }
        right[prices.length-1] = 0;
        for (int i=prices.length-2; i>=0; --i) {
            if (prices[i] > max) {
                max = prices[i];
            }
            right[i] = Math.max(right[i+1], max-prices[i]);
        }
        for (int i=0; i<prices.length; ++i) {
            res = Math.max(res, left[i]+right[i]);
        }
        return res;
    }	

    public static void main(String[] args) {
    	int[] prices = {7, 1, 5, 3, 6, 4};

    	System.out.println(maxProfit(prices));
    }
}