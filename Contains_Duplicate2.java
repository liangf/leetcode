
import java.util.*;

public class Contains_Duplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i - j <= k) return true;
            } 
            map.put(nums[i], i);
        }
        return false;
    }

	public static void main(String[] args) {

	}
}
