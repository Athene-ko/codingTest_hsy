public class l125 {
    public boolean isPalindrome(String s) {
        s = removeAllNonAlphaNumeric(s);
        System.out.println(s);
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;

            } else {
            }
            start++;
            end--;
        }
        return true;
    }

    public static String removeAllNonAlphaNumeric(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }
}