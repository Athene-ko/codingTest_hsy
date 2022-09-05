public class l28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) { return -1;}
        int firstIndex = 0;
        char n1 = needle.charAt(0);
        while( firstIndex < haystack.length() ) {
            if ( haystack.charAt(firstIndex) == n1) { // 동일하다면 중단
                break;
            } else { // 동일하지 않다면 증가
                firstIndex++;
            }
        }
        int needleIndex = firstIndex ;
        if (firstIndex == haystack.length()) {
            return -1;
        } else {
            int cursor = needleIndex; // 1
            while(cursor < needle.length()) { 
                if (haystack.charAt(firstIndex) - needle.charAt(cursor) == 0) {
                    firstIndex++;
                    cursor++;
                } else {
                    needleIndex = -1;
                    break;
                }
            }
        }
        return needleIndex;
    }
}
