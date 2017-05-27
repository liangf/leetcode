


public class palindrome_partitioning2 {
	
    public static int minCut(String s) {
    	if (s==null || s.length()==0) return 0;
    	int n = s.length();
    	boolean[][] p = new boolean[n][n];
    	int[] dp = new int[n+1];

    	palindrom(s, p);
    	dp[0] = -1;
    	for (int i=1; i<=n; ++i) {
    		dp[i] = i;
    		for (int j=1; j<=i; ++j) {
    			if (p[j-1][i-1]) {
    				dp[i] = Math.min(dp[i], dp[j-1]+1);
    			}
    		}
    	}
    	return dp[n];
    }

    public static void palindrom(String s, boolean[][] p) {
    	int n = s.length();
    	for (int i=0; i<n; ++i) {
    		for (int j=i; j>=0; --j) {
    			p[j][i] = s.charAt(j) == s.charAt(i) && (i-j<=1 || p[j+1][i-1]);
    		}
    	}
    }

	public static void main(String[] args) {

		String s = "aab";
		s = "aa";
		s = "ab";
		System.out.println(minCut(s));
	}
}