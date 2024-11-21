class Solution {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder();
        for(int i = my_string.length() - n; i < my_string.length(); i++) {
            str.append(my_string.charAt(i));
        }
        return str.toString();
    }
}

