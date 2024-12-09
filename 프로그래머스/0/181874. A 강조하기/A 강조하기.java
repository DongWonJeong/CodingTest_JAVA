class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++){
            char word = myString.charAt(i);
            if (word == 'a') {
                answer += Character.toUpperCase(word);;  
            } else if (word >= 'B' && word <= 'Z') {
                answer += Character.toLowerCase(word);
            } else {
                answer += word;
            }
        }
        return answer;
    }
}