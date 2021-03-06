
import java.util.*;

public class container_with_most_water {

    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxArea = 0;
        
        while (left < right) {
            maxArea = Math.max(maxArea, (right-left)*Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return maxArea;
    }

	public static void main(String[] args) {
		System.out.println("hello");
	}
}
