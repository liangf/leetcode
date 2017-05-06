
import java.util.*;

public class valid_sudoku {

    public boolean isValidSudoku(char[][] board) {
        // check each row
        for (int i=0; i<9; ++i) {
            boolean[] map = new boolean[9];
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    if (!map[board[i][j] - '1']) {
                        map[board[i][j] - '1'] = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        // check each col
        for (int j=0; j<9; ++j) {
            boolean[] map = new boolean[9];
            for (int i=0; i<9; ++i) {
                if (board[i][j] != '.') {
                    if (!map[board[i][j] - '1']) {
                        map[board[i][j] - '1'] = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        // check each suboard
        for (int m=0; m<3; ++m) {
            for (int n=0; n<3; ++n) {
                boolean[] map = new boolean[9];
                for (int i=0; i<3; ++i) {
                    for (int j=0; j<3; ++j) {
                        if (board[m*3+i][n*3+j] != '.') {
                            if (!map[board[m*3+i][n*3+j] - '1']) {
                                map[board[m*3+i][n*3+j] - '1'] = true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
