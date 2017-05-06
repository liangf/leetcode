
import java.util.*;

public class three_sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int left=0; left<nums.length-2; ++left) {
            int mid = left + 1;
            int right = nums.length - 1;
            if (left-1>=0 && nums[left] == nums[left-1]) continue;
            while (mid < right) {
                if (mid-1>=left+1 && nums[mid] == nums[mid-1]) {
                    ++mid;
                    continue;
                }
                if (right+1<=nums.length-1 && nums[right] == nums[right+1]) {
                    --right;
                    continue;
                }
                if (nums[left] + nums[mid] + nums[right] == 0) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[left]);
                    tmp.add(nums[mid]);
                    tmp.add(nums[right]);
                    res.add(tmp);  
                    ++mid;                     
                } else if (nums[left] + nums[mid] + nums[right] < 0) {
                    ++mid;
                } else {
                    --right;
                }
            }
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.println("hello");

        int[] nums = {-1, 0, 1, 2, -1, -4}; 

        
        List<List<Integer>> res = threeSum(nums);

        for (int i=0; i<res.size(); ++i) {
            for (int j=0; j<res.get(i).size(); ++j) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }   
	}
}
