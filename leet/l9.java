public class l9 {
    public boolean isPalindrome(int x) {
        boolean result;
        
        if (x < 0 ) {
            result = false;
            return result;
        }
        
        String origin = Integer.toString(x);
        String reverse ="";
        char ch;
        
        for (int i = 0 ; i < origin.length(); i++) {
            ch = origin.charAt(i);
            reverse = ch + reverse;
        }
        
        
        result = origin.equals(reverse) ? true : false;
        
        return result;
    }
}
