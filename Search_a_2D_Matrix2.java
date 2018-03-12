


import java.util.*;

public class Search_a_2D_Matrix2{


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int num = matrix[row][col];
            if (target == num) return true;
            if (target < num) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    
	
	public static void main(String[] args) {

	}	
}