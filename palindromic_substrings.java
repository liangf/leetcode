


public class palindromic_substrings {
    
    public int countSubstrings(String s) {
      int res = 0;
      for (int i=0; i<s.length(); ++i) {
        res += extendSubstring(s, i, i);
        res += extendSubstring(s, i, i+1);
      }  
      return res;
    }

    public int extendSubstring(String s, int start, int end) {
      int count = 0;
      while (start >= 0 && end < s.length() && s.charAt(start)==s.charAt(end)) {
        ++count;
        --start;
        ++end;
      } 
      return count;
    }

  	public static void main(String[] args) {
      palindromic_substrings ps = new palindromic_substrings();
      ps.countSubstrings("fdsklf");
  	}
}