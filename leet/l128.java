import java.util.*;

public class l128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // findMax
        int max = 0;
        for (int n : nums) {
            int cnt = 0;
            if (set.contains(n)) {
                cnt++;
                set.remove(n);
                int left = n - 1;
                int right = n + 1;

                while (set.contains(left)) {
                    set.remove(left);
                    cnt++;
                    left--;
                }
                while (set.contains(right)) {
                    set.remove(right);
                    cnt++;
                    right++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
