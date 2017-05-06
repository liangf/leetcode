
import java.util.*;

public class merge_intervals {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();
        if (intervals == null || intervals.size() < 1) {
            return res;
        }
        Comparator<Interval> comp = new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                if (i1.start == i2.start) {
                    return i1.end - i2.end;
                }
                return i1.start - i2.start;
            }
        };

        Collections.sort(intervals, comp);

        res.add(intervals.get(0));
        for (int i=1; i<intervals.size(); ++i) {
            Interval last = res.get(res.size()-1);
            if (intervals.get(i).start <= last.end) {
                last.end = Math.max(intervals.get(i).end, last.end);
            } else {
                res.add(intervals.get(i));
            }
        }
        return res;
    }

	public static void main(String[] args) {

		System.out.println("hello");

	}
}
