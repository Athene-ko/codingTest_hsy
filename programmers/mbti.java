import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mbti {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> answers = new HashMap();
        for (int i = 0; i < survey.length; i++) {
            char key;
            if (choices[i] < 4) {
                key = survey[i].charAt(0);
            } else if (choices[i] > 4) {
                key = survey[i].charAt(1);
            } else {
                continue;
            }
            answers.put(key, answers.getOrDefault(key, 0) + Math.abs(choices[i] - 4));
        }
        String[] types = {"RT", "CF", "JM", "AN"};
        Set<Character> keys = answers.keySet();
        for (String type : types) {
            char ch1 = type.charAt(0);
            char ch2 = type.charAt(1);
            if (keys.contains(ch1) && keys.contains(ch2)){
                if (answers.get(ch1) < answers.get(ch2)) {
                    answer += ch2;
                } else {
                    answer += ch1;
                }
            } else if (keys.contains(ch1) && !keys.contains(ch2)) {
                answer += ch1;
            } else if (!keys.contains(ch1) && keys.contains(ch2)) {
                answer += ch2;
            } else {
                answer += ch1;
            }
            
        }


        System.out.println(answers.toString());
        return answer;
    }
}
