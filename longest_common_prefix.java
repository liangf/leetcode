
import java.util.*;

public class longest_common_prefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pre = strs[0];
        for (int i=1; i<strs.length; ++i) {
            String tmp = "";
            int len = Math.min(pre.length(), strs[i].length());
            for (int j=1; j<=len; ++j) {
                if (pre.substring(0, j).equals(strs[i].substring(0, j))) {
                    tmp = pre.substring(0, j);
                } else {
                    break;
                }
            }
            pre = tmp;
        }

        return pre;
    }

	public static void main(String[] args) {
		System.out.println("hello");

        String[] strs = new String[2];
        strs[0] = "c";
        strs[1] = "c";
        System.out.println(longestCommonPrefix(strs));
	}
}
