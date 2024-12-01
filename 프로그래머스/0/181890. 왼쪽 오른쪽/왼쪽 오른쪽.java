class Solution {
    public String[] solution(String[] str_list) {
        
        String[] arr = new String[str_list.length];
        int count = 0;
        
        for(int i = 0;i < str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j = 0; j < i; j++){
                    arr[count] = str_list[j];
                    count++;
                }
                break;
            } else if(str_list[i].equals("r")){
                for(int j = i+1; j < str_list.length; j++){
                    arr[count] = str_list[j];
                    count++;
                }
                break;
            }
        }
        
        String[] answer = new String[count];
        for(int i = 0; i < count; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}