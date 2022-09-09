public class l8 {
    // public int myAtoi(String s) {
    // s = s.stripLeading().stripTrailing();
    // String[] arr = s.split(" ");
    // for (String str : arr) {
    // if (isNumber(str)) {
    // return parseInt(str);
    // } else {
    // return 0;
    // }
    // }

    // return 0;
    // }

    // public static boolean isNumber(String s) {
    // try {
    // Long.parseLong(s);
    // return true;
    // } catch (NumberFormatException e) {
    // return false;
    // }
    // }

    // public static int parse(String s) {
    // Long number = Long.parseLong(s);
    // if (number >= Integer.MAX_VALUE || number <= Integer.MIN_VALUE) {
    // return Integer.MAX_VALUE;
    // } else if (number <= Integer.MIN_VALUE) {
    // return Integer.MIN_VALUE;
    // } else {
    // int i = (int) number;
    // return i;
    // }
    // }
    public int myAtoi(String s) {
        int answer = 0;
        int current = 0;
        int sign = 1;
        boolean permission = false; // 숫자인가 아닌가
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' && !permission) {
                permission = true; // 숫자가 맞음
                sign = -1;
                continue;
            }
            if (s.charAt(i) == '+' && !permission) {
                permission = true; // 숫자가 맞음
                sign = 1;
                continue;
            }
            if (s.charAt(i) == ' ' && !permission) {
                continue;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                permission = true;
                current = s.charAt(i) - '0'; // 0이면 0, 5이면 5
                if (answer * sign > Integer.MAX_VALUE / 10
                        || (answer * sign == Integer.MAX_VALUE / 10 && current > 7)) {
                    return Integer.MAX_VALUE;
                }
                if (answer * sign < Integer.MIN_VALUE / 10
                        || (answer * sign == Integer.MIN_VALUE / 10 && current > 8)) {
                    return Integer.MIN_VALUE;
                }
                answer = answer * 10 + current;
            } else {
                return answer * sign;
            }

        }
        return answer * sign;
    }
}
