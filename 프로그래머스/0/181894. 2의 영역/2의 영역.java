import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> positions = new ArrayList<>(); 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                positions.add(i);
            }
        }

        if(positions.size() >= 2) {
            int start = positions.get(0); 
            int end = positions.get(positions.size() - 1); 
            
            int[] answer = new int[end - start + 1];
            for(int i = start; i <= end; i++) {
                answer[i - start] = arr[i];
            }
            return answer;
        } else if (positions.size() == 1) {
            int start = positions.get(0);
            int[] answer = new int[1];
            answer[0] = arr[start];
            return answer;  
        } 

        return new int[]{-1};
    }
}
