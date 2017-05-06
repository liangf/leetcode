
import java.util.*;

public class trapping_rain_water {

    public static int trap(int[] height) {
        int maxHeightIndex = 0, maxHeight = 0;
        int maxLeft = 0, maxRight = 0, res = 0;

        for (int i=0; i<height.length; ++i) {
            if (height[i] > maxHeight) {
                maxHeightIndex = i;
                maxHeight = height[i];
            }
        }

        for (int i=0; i<maxHeightIndex; ++i) {
            if (height[i] < maxLeft) {
                res += maxLeft - height[i];
            } else {
                maxLeft = height[i];
            }
        }

        for (int i=height.length-1; i>maxHeightIndex; --i) {
            if (height[i] < maxRight) {
                res += maxRight - height[i];
            } else {
                maxRight = height[i];
            }
        }
        return res;
    }



	public static void main(String[] args) {

		System.out.println("hello");

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
	}
}
