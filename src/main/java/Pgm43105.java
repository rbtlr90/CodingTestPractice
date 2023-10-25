
public class Pgm43105 {
    public int solution(int[][] triangle) {
        int numRows = triangle.length;
        int[][] dp = new int[numRows][numRows+2];

        for (int i = 0; i < numRows; i++){
            dp[i][0] = 0;
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j+1] = triangle[i][j];
            }
            dp[i][numRows + 1] = 0;
        }

        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j <= i + 1; j++) {
                dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }

        int answer = Integer.MIN_VALUE;
        for (int j = 1; j <= numRows; j++) {
            answer = Math.max(answer, dp[numRows - 1][j]);
        }

        return answer;
    }
}
