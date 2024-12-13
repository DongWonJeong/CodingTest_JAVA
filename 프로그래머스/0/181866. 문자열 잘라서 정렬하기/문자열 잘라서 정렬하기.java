import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {

        String[] xWord = myString.split("x");
        
        return Arrays.stream(xWord)
                     .filter(str -> !str.isEmpty()) 
                     .sorted()             
                     .toArray(String[]::new);
    }
}