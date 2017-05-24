
import java.util.*;

public class word_ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	int count = 1;
    	Queue<String> que = new LinkedList<String>();

    	que.offer(beginWord);
    	while ( !que.isEmpty() ) {
    		Queue<String> next = new LinkedList<String>();
    		while ( !que.isEmpty() ) {
    			String word = que.poll();
    			char[] cArr = word.toCharArray();
    			if ( word.equals(endWord) ) return count;
    			for (int i=0; i<cArr.length; ++i) {
    				for (char c='a'; c<'z'; ++c) {
    					cArr[i] = c;
    					String s = String.valueOf(cArr);
    					if (wordList.contains(s)) {
    						next.offer(s);
    						wordList.remove(s);
    					}
    				}
    			}
    		}
    		que = next;	
    		++count;
    	}
    	return -1;
    }

    public static void main(String[] args) {

    }	
}