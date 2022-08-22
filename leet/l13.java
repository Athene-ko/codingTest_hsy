public class l13 {
    public int romanToInt(String s) {
        Map<Character, Integer> tallies = Map.of(
          'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
  
        int sum = 0;
  
        for (int i = 0; i < s.length()-1; i++ ){
          char left = s.charAt(i);
          char right = s.charAt(i+1);
          
          if (tallies.get(left) < tallies.get(right)) {
            sum = sum -tallies.get(left);
          } else {
            sum = sum + tallies.get(left);
          }
        }
        
        sum += tallies.get(s.charAt(s.length()-1));
        return sum;
      }
}
