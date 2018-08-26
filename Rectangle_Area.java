
import java.util.*;

public class Rectangle_Area {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int x1 = A, x2 = C, x3 = E, x4 = G;
        int y1 = B, y2 = D, y3 = F, y4 = H;
        int S = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3);
        if (x2 <= x3 || x4 <= x1 || y2 <= y3 || y4 <= y1) {
            return S;
        } 
        int[] xx = findInteraction(x1, x2, x3, x4);
        int[] yy  = findInteraction(y1, y2, y3, y4);
        int commonS = (xx[1] - xx[0]) * (yy[1] - yy[0]);
        return S - commonS;
    }
    public int[] findInteraction(int x1, int x2, int x3, int x4) {
        int[] res = new int[2];
        if (x2 <= x4) {
            res[1] = x2;
            res[0] = x3 > x1 ? x3 : x1;
        } else {
            res[1] = x4;
            res[0] = x1 > x3 ? x1 : x3;
        }
        return res;
    }

	public static void main(String[] args) {

	}
}
