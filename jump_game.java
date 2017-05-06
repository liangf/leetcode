
import java.util.*;

public class jump_game {

    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i=0; i<nums.length; ++i) {
            reach = Math.max(reach, nums[i] + i);
            if (reach <= i && i != nums.length-1) {
                return false;
            }
        }  
        return true;    
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
