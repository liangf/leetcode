
import java.util.*;

public class Summary_Ranges {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length < 1) return res;
        int start, end;
        start = end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]+1) {
                end = nums[i];
            } else {
                if (start == end) res.add(Integer.toString(start));
                else res.add(Integer.toString(start) + "->" + Integer.toString(end));
                start = end = nums[i];
            }
        }
        if (start == end) res.add(Integer.toString(start));
        else res.add(Integer.toString(start) + "->" + Integer.toString(end));        
        return res;
    }

	public static void main(String[] args) {

	}
}
