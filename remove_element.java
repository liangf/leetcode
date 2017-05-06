
import java.util.*;

public class remove_element {

    public int removeElement(int[] nums, int val) {
        int pre = -1;
        for (int i=0; i<nums.length; ++i) {
            if (nums[i] != val) {
                ++pre;
                nums[pre] = nums[i];
            }
        }
        return pre + 1;   
    }

	public static void main(String[] args) {

		System.out.println("hello");
	}
}
