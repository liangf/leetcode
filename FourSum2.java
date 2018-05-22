
import java.util.*;

public class FourSum2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> mapAB = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < A.length; i++) {
        	for (int j = 0; j < B.length; j++) {
        		int sum = A[i] + B[j];
        		if (mapAB.containsKey(sum)) {
        			mapAB.put(sum, mapAB.get(sum) + 1);
        		} else {
        			mapAB.put(sum, 1);
        		}
        	}
        }

        int res = 0;
        for (int i = 0; i < C.length; i++) {
        	for (int j = 0; j < D.length; j++) {
        		int sum = C[i] + D[j];
        		if (mapAB.containsKey(-sum)) {
        			res += mapAB.get(-sum);
        		}
        	}
        }
        return res;
    }

	public static void main(String[] args) {

	}
}
