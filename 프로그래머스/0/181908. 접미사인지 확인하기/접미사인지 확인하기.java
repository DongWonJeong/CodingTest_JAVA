class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            String word = my_string.substring(i, my_string.length());
            if(word.equals(is_suffix)){
                answer = 1;
            }
        }
        return answer;
    }
}