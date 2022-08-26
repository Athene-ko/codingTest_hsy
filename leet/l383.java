import java.util.HashMap;

public class l383 {
    // Solution1. Hash Table
    public static boolean canConstruct(String ransomNote, String magazine, boolean expectedAnswer) {
        int[] letters = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--letters[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;

    }

    // HashTable Long version
    public static boolean canConstruct2(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = magazine.length();

        for (int i = 0; i < len; i++) {
            char current = magazine.charAt(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        len = ransomNote.length();
        for (int i = 0; i < len; i++) {
            char key = ransomNote.charAt(i);
            if (map.get(key) != null && map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
