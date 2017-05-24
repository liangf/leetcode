


public class valid_palindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while (left < right) {
        	if (!Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
        		++left;
        		continue;
        	}
        	if (!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
        		--right;
        		continue;
        	}
        	if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        		return false;
        	}   
        	++left;
        	--right;     	
        }
        return true;
    }

    public static void main(String[] args) {
    	System.out.println(Character.isLetter('0'));
    }	
}