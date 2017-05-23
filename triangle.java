
import java.util.*;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int n = triangle.size();
    	int[][] dp = new int[n][n];
    	int res = Integer.MAX_VALUE;
        
        dp[0][0] = triangle.get(0).get(0);
    	for (int i=1; i<n; ++i) {
    		for (int j=0; j<=i; ++j) {
    			int a = triangle.get(i).get(j);
    			int x = j > 0 ? dp[i-1][j-1] : Integer.MAX_VALUE;
    			int y = j < i ? dp[i-1][j] : Integer.MAX_VALUE;
    			dp[i][j] = a + Math.min(x, y);
    		}
    	} 
    	for (int j=0; j<n; ++j) {
    		if (dp[n-1][j] < res) res = dp[n-1][j];
    	}
    	return res;   
    }

	public static void main(String[] args) {

	}	
}