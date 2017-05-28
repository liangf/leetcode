
import java.util.*;

public class word_break {
    public boolean wordBreak(String s, List<String> wordDict) {
    	int n = s.length();
    	boolean[] dp = new boolean[n+1];

    	dp[0] = true;
    	for (int i=1; i<=n; ++i) {
    		for (int j=i; j>=1; --j) {
    			if ( wordDict.contains(s.substring(j-1, i)) ) {
    				if (dp[j-1]) {
    					dp[i] = true;
    					break;
    				}
    			}
    		}
    	}
    	return dp[n];
    }

	public static void main(String[] args) {

	}
}