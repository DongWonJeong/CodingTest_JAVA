class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rny_string.length(); i++) {
            char str = rny_string.charAt(i);
            if (str == 'm') {
                answer.append("rn");
            } else {
                answer.append(str);
            }
        }

        return answer.toString();
    }
}