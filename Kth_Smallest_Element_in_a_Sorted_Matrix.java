
import java.util.*;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {

	class Point implements Comparable<Point> {
		int x;
		int y;
		int val;
		Point(int x1, int y1, int val1) {
			this.x = x1;
			this.y = y1;
			this.val = val1;
		}
		public int compareTo(Point that) {
			return this.val - that.val;
		}
	}
    // public int kthSmallest(int[][] matrix, int k) {
    //     PriorityQueue<Point> pq = new PriorityQueue<Point>();
    //     for (int j = 0; j < matrix[0].length; j++) {
    //     	pq.offer(new Point(0, j, matrix[0][j]));
    //     }
    //     for (int i = 0; i < k-1; i++) {
    //     	Point p = pq.poll();
    //     	if (p.x < matrix.length-1) {
    //     		pq.offer(new Point(p.x+1, p.y, matrix[p.x+1][p.y]));
    //     	}
    //     }
    //     return pq.poll().val;
    // }

    public int kthSmallest(int[][] matrix, int k) {
    	int m = matrix.length, n = matrix[0].length;
    	int left = matrix[0][0];
    	int right = matrix[m-1][n-1];

    	while (left < right) {
    		int mid = left + (right-left)/2;
    		int count = 0;
    		for (int i = 0; i < m; i++) {
    			int offset = upperBound(matrix[i], mid);
    			count += offset;
    		}
    		if (count < k) {
    			left = mid + 1;
    		} else {
    			right = mid;
    		}
    	}
    	return left;
    }
    int upperBound(int[] row, int key) {
    	int i = 0;
    	while (i < row.length && row[i] <= key) {
    		i++;
    	}
    	return i;
    }

   

	public static void main(String[] args) {

	}
}
