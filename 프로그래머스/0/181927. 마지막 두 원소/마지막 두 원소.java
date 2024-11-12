class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        
        if(num_list[length-1] > num_list[length-2]){
            for(int i = 0; i < length; i++){
                answer[i] = num_list[i];
            }
            answer[length] = num_list[length-1] - num_list[length-2];
            return answer;
        } else {
            for(int i = 0; i < length; i++){
                answer[i] = num_list[i];
            }
            answer[length] = 2 * num_list[length - 1];
            return answer;
        }
    }
}