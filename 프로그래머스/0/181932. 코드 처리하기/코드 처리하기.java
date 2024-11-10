class Solution {
    public String solution(String code) {
        String ret = ""; 
        int mode = 0;  

        for (int i = 0; i < code.length(); i++) {
            char word = code.charAt(i);

            if (word == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        ret = ret + word;  
                    }
                }
                if (mode == 1) {
                    if (i % 2 == 1) {
                        ret = ret + word;  
                    }
                }
            }
        }

        if (ret.isEmpty()) {
            return "EMPTY";
        } else {
            return ret;
        }
    }
}