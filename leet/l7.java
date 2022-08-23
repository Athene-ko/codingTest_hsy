import java.lang.Math;

public class l7 {
    public static void main(String[] args) {

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        } else if (x <= -Math.pow(2, 31) || x >= Math.pow(2, 31)) {
            return 0;
        }
        boolean negative = x < 0;
        String strX = Integer.toString(Math.abs(x));
                
        StringBuilder sb = new StringBuilder(strX);
        sb.reverse();
        Long val = 0L;
        if (negative) {
            val = Long.parseLong("-" + sb.toString());
        } else {
            val = Long.parseLong(sb.toString());
        }
        if (val < -Math.pow(2, 31) || val > Math.pow(2, 31)) {
            return 0;
        }
        return val.intValue();
}
