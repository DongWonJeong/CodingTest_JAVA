class Solution {
    public int solution(int a, int b) {
        
        String AB = String.valueOf(a) + String.valueOf(b);
        int plus = 2 * a * b;
        String PLUS = String.valueOf(plus);
        
        int ab = Integer.parseInt(AB);
        
        if (ab > plus) {
            return ab;
        } else if (ab == plus) {
            return ab;
        } else {
            return plus;
        }
        
    }
}