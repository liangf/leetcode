import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;

public class assignment_tapjoy {
	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			++i;
			--j;
		}
		return true;
 	}

	public static boolean haveReversePair(String s) {
		boolean hasBracket = false;
		for (int i=0; i<s.length()-3; ++i) {
			if (s.charAt(i) == '[') {
				hasBracket = true;
				continue;
			} else if (s.charAt(i) == ']') {
				hasBracket = false;
				continue;
			} else {
				if (hasBracket) {
					continue;
				} else {
					if (isPalindrome(s, i, i+3) && s.charAt(i)!=s.charAt(i+1)) {
						// System.out.println("Found match:" + s.substring(i, i+4));
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String fileName = args[0];
    	String baseDir = System.getProperty("user.dir");
    	String inputFile = baseDir + "/" + fileName;
    	
    	
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

        	int count = 0;

            while ((line = br.readLine()) != null) {
                
            	if (haveReversePair(line)) {
            		++count;
            		System.out.println(line);
            	}
            }

            System.out.println("There are total:" + count);
        } catch (IOException e) {
            e.printStackTrace();
        }  
	}
}
