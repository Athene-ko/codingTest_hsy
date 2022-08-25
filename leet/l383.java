public class l383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder rnsb = new StringBuilder(ransomNote);
        char[] letters = magazine.toCharArray();
        // TODO
        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(letters.toString()));
        List<String> list = Arrays.asList(letters.toString());
        for (String c : hashSet) {
            if (rnsb.toString().length() == 0) { // 1
                return false;
            } else {
                if (rnsb.toString().contains(c)) { // true
                    int idx = rnsb.toString().indexOf(c); // 0
                    rnsb.deleteCharAt(idx); // rnsb = "a"
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
