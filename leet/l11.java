public class l11 {
    // Time limit exceeded
    public int maxArea(int[] height) {
        int x1 = 0;
        int x2 = height.length - 1;
        int MAXAREA = 0;
        int h1, h2;
        int area;
        while (x1 < x2) {
            h1 = height[x1];
            h2 = height[x2];
            if (h1 < h2) {
                area = (x2 - x1) * h1;
                x1++;
            } else {
                area = (x2 - x1) * h2;
                x2--;
            }
            if (MAXAREA < area) {
                MAXAREA = area;
            }
        }

        return MAXAREA;
    }
}
