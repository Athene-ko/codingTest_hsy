public class l27 {
    public int removeElement(int[] nums, int val) {
        int newIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newIdx] = nums[i];
                newIdx++;
            }
        }
        return newIdx;
    }
}
