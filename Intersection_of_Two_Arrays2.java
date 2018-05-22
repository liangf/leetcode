
import java.util.*;

public class Intersection_of_Two_Arrays2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> common = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                common.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[common.size()]; 
        for (i = 0; i < common.size(); i++) {
            res[i] = common.get(i);
        }
        return res;
    }

	public static void main(String[] args) {

	}
}
