
import java.util.*;

public class Game_of_Life {

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int neighborlives = getNeighborLives(board, i, j);
                if (board[i][j] == 0) {
                    if (neighborlives == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (neighborlives >=2 && neighborlives <= 3) {
                        board[i][j] = 3;
                    }
                }        
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }
    public int getNeighborLives(int[][] board, int x, int y) {
        int sum = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <=1; j++) {
                int m = i + x;
                int n = j + y;
                if (i == 0 && j == 0) continue;
                if (m>=0 && m<board.length && n>=0 && n<board[0].length) {
                    sum += board[m][n] & 1;
                }
            }
        }
        return sum;
    }

	public static void main(String[] args) {

	}
}
