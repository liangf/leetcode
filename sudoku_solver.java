
import java.util.*;

public class sudoku_solver {

    public static void solveSudoku(char[][] board) {
    	help(board);
    }

    public static boolean help(char[][] board) {
   		for (int i=0; i<board.length; ++i) {
   			for (int j=0; j<board[0].length; ++j) {
   				if (board[i][j] == '.') {
   					for (int k=1; k<=9; ++k) {
   						char c = (char)('0' + k);
   						if (canPlace(board, i, j, c)) {
   							board[i][j] = c;
   							if(help(board)) {
   								return true;
   							} else {
   								board[i][j] = '.';
   							}
   						}
   					}
   					return false;
   				}
   			}
   		} 
   		return true;   	
    }

    public static boolean canPlace(char[][] board, int iRow, int jCol, char c) {
    	boolean[] visitedRow = new boolean[9];
    	boolean[] visitedCol = new boolean[9];
    	boolean[] visitedBlock = new boolean[9];
    	for (int i=0; i<9; ++i) {
    		if (board[i][jCol] != '.') {
    			if (visitedRow[board[i][jCol]-'1']) {
    				return false;
    			} 
    			visitedRow[board[i][jCol]-'1'] = true;
    		}
    	}
    	for (int j=0; j<9; ++j) {
    		if (board[iRow][j] != '.') {
    			System.out.println("***" + board[iRow][j]);
    			if (visitedCol[board[iRow][j]-'1']) {
    				return false;
    			}
    			visitedCol[board[iRow][j]-'1'] = true;
    		}
    	}
        // for(int i = 0; i < 9; i++) {
        //     if(board[iRow][i] != '.' && board[iRow][i] == c) return false; 
        // }    	

    	// int m = (iRow / 3) * 3;
    	// int n = (jCol / 3) * 3;
    	// for (int i=0; i<3; ++i) {
    	// 	for (int j=0; j<3; ++j) {
    	// 		if (board[m+i][n+j] != '.') {
    	// 			if (visitedBlock[board[m+i][n+j]-'1']) {
    	// 				return false;
    	// 			}
    	// 			visitedBlock[board[m+i][n+j]-'1'] = true;
    	// 		}
    	// 	}
    	// }
        for(int i = 0; i < 9; i++) {
            if(board[3 * (iRow / 3) + i / 3][ 3 * (jCol / 3) + i % 3] != '.' && 
board[3 * (iRow / 3) + i / 3][3 * (jCol / 3) + i % 3] == c) return false; //check 3*3 block
        }    	
    	return true;
    }

	public static void main(String[] args) {

		System.out.println("hello");

		char[][] board = {
			{'.', '.', '9', '7', '4', '8', '.', '.', '.'}, 
			{'7', '.', '.', '.', '.', '.', '.', '.', '.'}, 
			{'.', '2', '.', '1', '.', '9', '.', '.', '.'}, 
			{'.', '.', '7', '.', '.', '.', '2', '4', '.'}, 
			{'.', '6', '4', '.', '1', '.', '5', '9', '.'}, 
			{'.', '9', '8', '.', '.', '.', '3', '.', '.'}, 
			{'.', '.', '.', '8', '.', '3', '.', '2', '.'}, 
			{'.', '.', '.', '.', '.', '.', '.', '.', '6'}, 
			{'.', '.', '.', '2', '7', '5', '9', '.', '.'}
		};

		solveSudoku(board);
	}
}
