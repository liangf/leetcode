
import java.util.*;

public class Number_of_Islands {
    class UF {
        public int count = 0;
        private int[] id = null;
        UF(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            id = new int[m * n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') count++;
                    id[i*n + j] = i*n + j;
                }
            }
        }
        public int find(int p) {
            while (id[p] != p) {
                p = id[p];   
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            id[rootP] = id[rootQ];   
            count--;          
        }
    }


    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        UF uf = new UF(grid);
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int p = i * n + j;
                if (grid[i][j] == '1') {
                    if (i > 0 && grid[i-1][j] == '1') uf.union(p, p-n);
                    if (j+1 < n && grid[i][j+1] == '1') uf.union(p, p+1);
                    if (i+1 < m && grid[i+1][j] == '1') uf.union(p, p+n);
                    if (j > 0 && grid[i][j-1] == '1') uf.union(p, p-1);
                }
            }
        }
        return uf.count;
    }


    // public int numIslands(char[][] grid) {
    //  if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;

    //  int count = 0;
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     for (int i = 0; i < m; i++) {
    //      for (int j = 0; j < n; j++) {
    //          if (grid[i][j] == '1') {
    //              help(grid, i, j);
    //              count++;
    //          }
    //      }
    //     }
    //     return count;
    // }

    // private void help(char[][] grid, int x, int y) {
    //  int m = grid.length;
    //  int n = grid[0].length;
    //  if (x < 0 || x >= m || y < 0 || y >= n) return;
    //  if (grid[x][y] == '0') return;

    //  grid[x][y] = '0';
    //  help(grid, x, y+1);
    //  help(grid, x+1, y);
    //  help(grid, x, y-1);
    //  help(grid, x-1, y);
    // }
	
	public static void main(String[] args) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        Number_of_Islands noi = new Number_of_Islands();
        System.out.println(noi.numIslands(grid));
	}	
}