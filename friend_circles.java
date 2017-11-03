import java.util.*;


public class  friend_circles {
  
    public int findCircleNum(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int count = 0;

        for (int i=0; i<m; i++) {
        	for (int j=0; j<n; j++) {
        		if (M[i][j] == 1) {
        			help(M, i, j);
                    count++;
        		}
        	}
        }
        return count;
    }

    private void help(int[][] M, int pi, int pj) {
    	Stack<int[]> stk = new Stack<>();
    	stk.push(new int[]{pi, pj});
    	M[pi][pj] = 2;
    	M[pj][pi] = 2;

    	while ( !stk.empty() ) {
    		int[] pos = stk.pop();
    		int i = pos[0];
    		int j = pos[1];
    		for (int k=0; k<M[0].length; ++k) {
    			if (M[j][k] == 1) {
    				M[j][k] = 2;
    				M[k][j] = 2;
    				stk.push(new int[]{j, k});
    			}
    		}
    	}
    }

  	public static void main(String[] args) {

  	}
} 