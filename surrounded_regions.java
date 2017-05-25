
import java.util.*;

public class surrounded_regions {
    
    public void solve(char[][] board) {
        if (board==null || board.length==0 || board[0]==null || board[0].length==0) return;
        int m = board.length, n = board[0].length;

        for (int i=0; i<m; ++i) {
       		if (board[i][0] == 'O') {
       			help(board, i, 0);
       		}
       		if (board[i][n-1] == 'O') {
       			help(board, i, n-1);
       		}
        }
        for (int j=0; j<n; ++j) {
        	if (board[0][j] == 'O') {
        		help(board, 0, j);
        	}
        	if (board[m-1][j] == 'O') {
        		help(board,m-1, j);
        	}
        }

        for (int i=0; i<m; ++i) {
        	for (int j=0; j<n; ++j) {
        		if (board[i][j] == 'O') {
        			board[i][j] = 'X';
        		} else if (board[i][j] == '#') {
        			board[i][j] = 'O';
        		}
        	}
        }
    }	

    // public void help(char[][] board, int x, int y) {
    // 	if (x<0 || y<0 || x>=board.length || y>=board[0].length) return;
    // 	if (board[x][y] != 'O') return;

    // 	board[x][y] = '#';
    // 	help(board, x, y+1);
    // 	help(board, x+1, y);
    // 	help(board, x, y-1);
    // 	help(board, x-1, y);
    // }

    public void help(char[][] board, int x, int y) {
    	Queue<List<Integer>> que = new LinkedList<List<Integer>>();

    	board[x][y] = '#';
    	que.offer(new ArrayList<Integer>(Arrays.asList(x, y)));
    	while (!que.isEmpty()) {
    		Queue<List<Integer>> next = new LinkedList<List<Integer>>();
    		while (!que.isEmpty()) {
    			List<Integer> pos = que.poll();
    			x = pos.get(0);
    			y = pos.get(1);
    			if ( isValid(board, x, y+1) ) {
    				board[x][y+1] = '#';
    				next.offer(new ArrayList<Integer>(Arrays.asList(x, y+1)));
    			}
    			if ( isValid(board, x+1, y) ) {
    				board[x+1][y] = '#';
    				next.offer(new ArrayList<Integer>(Arrays.asList(x+1, y)));
    			}
    			if ( isValid(board, x, y-1) ) {
    				board[x][y-1] = '#';
    				next.offer(new ArrayList<Integer>(Arrays.asList(x, y-1)));
    			}
    			if ( isValid(board, x-1, y) ) {
    				board[x-1][y] = '#';
    				next.offer(new ArrayList<Integer>(Arrays.asList(x-1, y)));
    			}    			    			    			
    		}
    		que = next;
    	}
    }

    public boolean isValid(char[][] board, int x, int y) {
    	if (x<0 || y<0 || x>=board.length || y>=board[0].length) return false;
    	if (board[x][y] != 'O') return false; 
    	return true;   	
    }

	public static void main(String[] args) {

	}
}