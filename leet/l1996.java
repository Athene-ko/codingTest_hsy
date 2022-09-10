import java.util.Arrays;

public class l1996 {
    // public int numberOfWeakCharacters(int[][] properties) {
    // int[] weekIndex = properties[0];
    // int weekCount = 0;

    // for(int i = 0; i < properties.length-1; i++){
    // int[] character = properties[i+1];
    // if (weekIndex[0] > character[0] && weekIndex[1] > character[1]) {
    // weekIndex = character;
    // weekCount++;
    // } else if(weekIndex[0] < character[0] && weekIndex[1] < character[1]) {
    // weekCount++;
    // }
    // }
    // return weekCount;
    // }
    // 통과못한 testcases : [[1,5],[10,4],[4,3]]

    public int numberOfWeakCharacters(int[][] properties) {
        // Time Complexity : O(n*logn)
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? (a[1] - b[1]) : (b[0] - a[0]));
        int count = 0, max = 0;
        for (int[] character : properties) {
            if (character[1] < max)
                count++;
            max = Math.max(max, character[1]);
        }
        return count;
    }
}
