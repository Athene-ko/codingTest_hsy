public class l5 {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            int start = s.indexOf(s.charAt(i));
            int end = s.lastIndexOf(s.charAt(i));
            String substring = s.substring(start, end + 1);

            while (start < end) {

                String reverse = "";
                char ch;
                for (int j = 0; j < substring.length(); j++) {
                    ch = substring.charAt(j);
                    reverse = ch + reverse;
                }
                if (substring.equals(reverse)) {
                    return substring;
                }
                                    // start와 end로 앞과 끝에서부터 똑같은지 비교
            }
            longestPalindrome = substring;
        }
        return longestPalindrome;
    }
}