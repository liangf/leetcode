
import java.util.*;

public class Wiggle_Sort2 {

    public void wiggleSort(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) tmp[i] = nums[i];
        Arrays.sort(tmp);
        int smallIndex = (nums.length + 1)/2;
        int largeIndex = nums.length;

        for (int i = 0; i < nums.length; i++) {
        	nums[i] =  (i % 2 == 1) ? tmp[--largeIndex] : tmp[--smallIndex];
        }    
    }

	public static void main(String[] args) {

	}
}
