class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = 0; i < myString.length() + 1; i++){
            String word = myString.substring(0,i);
            if(word.endsWith(pat)){
                answer = word;
            }
        }
        return answer;
    }
}