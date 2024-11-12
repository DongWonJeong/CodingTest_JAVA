class Solution {
    public int solution(int[] num_list) {
        
        String even_num = "";
        String odd_num = "";
        
        for(int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 1) {  
                odd_num += num_list[i];
            } else { 
                even_num += num_list[i];
            }
        }
        return Integer.parseInt(odd_num) + Integer.parseInt(even_num);
        
    }
}