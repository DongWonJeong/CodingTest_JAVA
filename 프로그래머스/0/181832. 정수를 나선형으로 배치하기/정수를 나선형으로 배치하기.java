class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1; // 배열 값
        int rowStart = 0; // 행의 시작 인덱스
        int rowEnd = n - 1; // 행의 끝 인덱스
        int colStart = 0; // 열의 시작 인덱스
        int colEnd = n - 1; // 열의 끝 인덱스

        while(num <= n * n) {
            for(int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++; 

            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--; 

            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++;
        }

        return answer;
    }
}