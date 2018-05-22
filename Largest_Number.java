
import java.util.*;

public class Largest_Number {

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";

        String[] snums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            snums[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(snums, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String s1s2 = s1 + s2;
                String s2s1 = s2 + s1;
                return s2s1.compareTo(s1s2);
            }
        });
        if (snums[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : snums) {
            sb.append(s);
        }
        return sb.toString();
    }

	public static void main(String[] args) {

	}
}
