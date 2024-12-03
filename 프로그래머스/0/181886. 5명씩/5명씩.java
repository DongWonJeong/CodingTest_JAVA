import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < (names.length + 4) / 5; i++) {
            answer.add(names[i * 5]);
        }
        
        return answer.toArray(new String[0]);
    }
}
