class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char word = my_string.charAt(i);
            if(word == alp.charAt(0)) {
                answer += Character.toUpperCase(word);
            } else {
                answer += word;
            }
        }
        return answer;
    }
}