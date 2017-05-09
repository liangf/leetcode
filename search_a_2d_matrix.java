


public class search_a_2d_matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    		return false;
    	}
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1;
        while (top <= bottom) {
        	int mid = top + (bottom-top)/2;
        	if (target == matrix[mid][0]) {
        		return true;
        	} else if (target < matrix[mid][0]) {
        		bottom = mid - 1;
        	} else {
        		top = mid + 1;
        	}
        }
        if (bottom < 0) return false;

        int row = bottom;
        int left = 0, right = n-1;
        while (left <= right) {
        	int mid = left + (right-left)/2;
        	if (matrix[row][mid] == target) {
        		return true;
        	} else if (matrix[row][mid] > target) {
        		right = mid - 1;
        	} else {
        		left = mid + 1;
        	}
        }
        return false;
    }

	public static void main(String[] args) {

	}	
}