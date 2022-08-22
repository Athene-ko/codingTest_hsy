public class l14 {
    public String longestCommonPrefix(String[] strs) {
        int minIndex = 0;
        for(int i = 0; i < strs.length; i++) {
            int length = strs[i].length();
            if (strs[minIndex].length() > length) minIndex = i ;
        }

        List<String> strings = Arrays.asList(strs);
        int lwl = strs[minIndex].length();
        String prefix = "";
        for(int i = 0 ; i < lwl; i++) {
            prefix = prefix +  Character.toString(strings.get(0).charAt(i));
            boolean isPrefix = true;
            for(int j = 1; j < strings.size(); j++) {
                if (!strings.get(j).startsWith(prefix)) {
                    isPrefix = false;
                    break;
                }
            };
            if (!isPrefix) {
                prefix = prefix.substring(0, prefix.length()-1);
                break;
            }
        }
        return prefix;
    }
}
