
import java.util.*;

public class next_permutation {
    private static void reverse(int[] num, int index) {  
        int l = index;  
        int r = num.length-1;  
        while(l<r)  
        {  
            int temp = num[l];  
            num[l] = num[r];  
            num[r] = temp;  
            l++;  
            r--;  
        }  
    }  

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;        

        int first = nums.length - 2, second = nums.length - 1;

        while (first >= 0) {
            if (nums[first] >= nums[first+1]) {
                first--;
            } else {
                break;
            }
        }
        if (first == -1) {
            reverse(nums, 0);
            return;
        }
        second = first + 1;
        while (second < nums.length) {
            if (nums[first] < nums[second]) {
                second++;
            } else {
                break;
            }
        }
        second -= 1;
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;

        reverse(nums, first + 1);
    }

	public static void main(String[] args) {

		System.out.println("hello");
        // int[] nums = {1, 4, 2, 3};
        int[] nums = {1,3,2};
        nextPermutation(nums);

        for (int i=0; i<nums.length; ++i) {
            System.out.print(nums[i] + " ");
        }
	}
}
