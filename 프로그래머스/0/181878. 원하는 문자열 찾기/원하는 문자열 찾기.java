class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            String sub = myString.substring(i, i + pat.length());
            
            if(sub.equals(pat)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}