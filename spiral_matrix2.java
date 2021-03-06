
import java.util.*;

public class spiral_matrix2 {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int k = 1;
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;

        while (left < right && top < bottom) {
            for (int j=left; j<right; ++j) {
                res[top][j] = k++;
            }
            for (int i=top; i<bottom; ++i) {
                res[i][right] = k++; 
            }
            for (int j=right; j>left; --j) {
                res[bottom][j] = k++;
            }
            for (int i=bottom; i>top; --i) {
                res[i][left] = k++;
            }
            ++left;
            --right;
            ++top;
            --bottom;
        }
        if (n % 2 == 1) {
            res[n/2][n/2] = k;
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
