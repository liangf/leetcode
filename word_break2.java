
import java.util.*;

public class word_break2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<String>();
        help(s, wordDict, 0, "", res);
        return res;
    }

    public void help(String s, List<String> wordDict, int start, String item, List<String> res) {
        if (start >= s.length()) {
            res.add(item);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=start; i<s.length(); ++i) {
            sb.append(s.charAt(i));
            if ( wordDict.contains(sb.toString()) ) {
                String newItem = item.length()>0 ? (item+" "+sb.toString()) : sb.toString();
                help(s, wordDict, i+1, newItem, res);
            }
        }
    }

	public static void main(String[] args) {

	}
}