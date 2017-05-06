


public class remove_k_digits {
	
    public static String removeKdigits(String num, int k) {
    	for (int i=0; i<k && num.length()>0; ++i) {
    		int j = 0;
    		while (j < num.length()-1) {
    			if (num.charAt(j) > num.charAt(j+1)) {
    				break;
    			}
    			++j;
    		}
    		String s = num.substring(0, j) + num.substring(j+1);

    		int m = 0;
    		while (m<s.length() && s.charAt(0)=='0') {
    			if (s.charAt(m) != '0') {
    				break;
    			}
    			++m;
    		}
    		String s2 = s.substring(m); 
    		num = s2;
    	}
    	return num.length() > 0 ? num : "0"; 
    }

	public static void main(String[] args) {

		System.out.println(removeKdigits("12345", 1));
		System.out.println(removeKdigits("1432219", 3));
		System.out.println(removeKdigits("10200", 1));
		System.out.println(removeKdigits("10", 2));
		System.out.println(removeKdigits("112", 1));
	}
}