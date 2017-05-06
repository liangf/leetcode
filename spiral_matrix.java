
import java.util.*;

public class spiral_matrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return res;
        }
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        while (left <= right && top <= bottom) {
            for (int j=left; j<=right; j++) {
                res.add(matrix[top][j]);
            }
            ++top;

            for (int i=top; i<=bottom; i++) {
                res.add(matrix[i][right]);
            }
            --right;

            if (top <= bottom) {
                for (int j=right; j>=left; j--) {
                    res.add(matrix[bottom][j]);
                }
                --bottom;                
            }

            if (left <= right) {
                for (int i=bottom; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
                ++left;                
            }
        }
        return res;    
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
