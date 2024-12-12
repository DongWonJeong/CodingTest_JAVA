class Solution {
    public int[] solution(String myString) {
        String[] xWord = myString.split("x", myString.length());
        int[] answer = new int[xWord.length];
        
        for(int i = 0; i < xWord.length; i++) {
            answer[i] = xWord[i].length();
        }
        
        return answer;
    }
}