

public class word_search {

    public boolean exist(char[][] board, String word) {
    	int m = board.length;
    	int n = board[0].length;

    	for (int i=0; i<m; ++i) {
    		for (int j=0; j<n; ++j) {
    			if ( help(board, word, 0, i, j) ) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

    public boolean help(char[][] board, String word, int start, int x, int y) {
    	if (start == word.length()) {
    		return true;
    	}
    	if (x<0 || y<0 || x>=board.length || y>=board[0].length) {
    		return false;
    	}
    	if (word.charAt(start) != board[x][y]) {
    		return false;
    	}

    	board[x][y] = '.';
    	if ( help(board, word, start+1, x, y+1) ) return true;
    	if ( help(board, word, start+1, x+1, y) ) return true;
    	if ( help(board, word, start+1, x, y-1) ) return true;
    	if ( help(board, word, start+1, x-1, y) ) return true;
    	board[x][y] = word.charAt(start);

    	return false;
    }

	public static void main(String[] args) {

	}
}