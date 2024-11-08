class Solution {
    public int solution(int a, int b) {
        
        String AB = String.valueOf(a) + String.valueOf(b);
        String BA = String.valueOf(b) + String.valueOf(a) ;
        
        int ab = Integer.parseInt(AB);
        int ba = Integer.parseInt(BA);
        
        if (ab > ba){
            return ab;
        } else {
            return ba;
        }
        
    }
}