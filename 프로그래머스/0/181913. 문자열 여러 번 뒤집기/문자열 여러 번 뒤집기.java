class Solution {
    public String solution(String my_string, int[][] queries) {        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            String first = my_string.substring(0, s); 
            String second = "";
            String third = my_string.substring(e+1, my_string.length());
                        
            for(int j = e; j >= s; j--){
                second = second + my_string.charAt(j);
            }
            my_string = first + second + third;
        }
        return my_string;
    }
}