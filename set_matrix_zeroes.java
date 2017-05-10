


public class set_matrix_zeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int m = matrix.length,n = matrix[0].length;
        boolean row0 = false, col0 = false;

        for (int i=0; i<m; ++i) {
        	if (matrix[i][0] == 0) {
        		col0 = true;
        	}
        }
        for (int j=0; j<n; ++j) {
        	if (matrix[0][j] == 0) {
        		row0 = true;
        	}
        }

        for (int i=0; i<m; ++i) {
        	for (int j=0; j<n; ++j) {
        		if (matrix[i][j] == 0) {
        			matrix[0][j] = 0;
        			matrix[i][0] = 0;
        		}
        	}
        }

        // set row to zero
        for (int i=1; i<m; ++i) {
        	if (matrix[i][0] == 0) {
        		for (int j=1; j<n; ++j) {
        			matrix[i][j] = 0;
        		}
        	}
        } 
        // set column to zero
        for (int j=1; j<n; ++j) {
        	if (matrix[0][j] == 0) {
        		for (int i=1; i<m; ++i) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        if (row0) {
        	for (int j=0; j<n; ++j) 
        		matrix[0][j] = 0;
        }
        if (col0) {
        	for (int i=0; i<m; ++i)
        		matrix[i][0] = 0;
        }
    }	

	public static void main(String[] args) {

	}
}