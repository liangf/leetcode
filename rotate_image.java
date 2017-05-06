
import java.util.*;

public class rotate_image {

    public static void rotate(int[][] matrix) {
        for (int i=0; i<matrix.length; ++i) {
            for (int j=0; j<i; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        } 

        int left = 0, right = matrix[0].length - 1;
        while (left < right) {
            for (int i=0; i<matrix.length; ++i) {
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;                
            }
            ++left;
            --right;
        }       
    }

    private static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


	public static void main(String[] args) {

		System.out.println("hello");

        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        rotate(matrix);

	}
}
