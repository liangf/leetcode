
import java.util.*;


public class Task_Scheduler {
	
    // public int leastInterval(char[] tasks, int n) {
    //     int[] count = new int[26];
    //     int maxFreq = 0;
    //     int mostFreqChars = 0;

    //     for (int i = 0; i < tasks.length; i++) {
    //         char c = tasks[i];
    //         maxFreq = Math.max(++count[c - 'A'], maxFreq);
    //     }
    //     for (int i = 0; i < 26; i++) {
    //         if (count[i] == maxFreq) {
    //             ++mostFreqChars;
    //         }
    //     }
    //     int res = (maxFreq - 1) * (n + 1) + mostFreqChars;
    //     return Math.max(res, tasks.length); 
    // }


    public int leastInterval(char[] tasks, int n) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        Comparator<Map.Entry<Character, Integer>> comp = new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                if (a.getValue() == b.getValue()) {
                    return a.getKey() - b.getKey();
                }
                return b.getValue() - a.getValue();
            }
        };        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(comp);
        for (char c : tasks) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        pq.addAll(map.entrySet());
        while ( !pq.isEmpty() ) {
            int k = n + 1;
            List<Map.Entry<Character, Integer>> tmp = new ArrayList<>();
            while (k > 0 && !pq.isEmpty()) {
                Map.Entry<Character, Integer> top = pq.poll();
                top.setValue(top.getValue() - 1);
                tmp.add(top);
                k--;
                count++;
            }   
            for (int i = 0; i < tmp.size(); i++) {
                if (tmp.get(i).getValue() > 0) {
                    pq.add(tmp.get(i));
                }
            }
            if (pq.isEmpty()) break;
            count += k;         
        }
        return count;  
    }    
}