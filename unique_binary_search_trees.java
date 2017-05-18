


public class unique_binary_search_trees {
	
    public static int numTrees(int n) {
        if (n <= 0) return 0;
        int[] res = new int[n+1];
        
        res[0] = 1;
        res[1] = 1;
        for (int k=2; k<=n; ++k) {
	        for (int i=1; i<=k; ++i) {
	        	res[k] += res[i-1] * res[k-i];
	        }
    	}
        return res[n];
    }

	public static void main(String[] args) {

		System.out.println(numTrees(3));
	}
}