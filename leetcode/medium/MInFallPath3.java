import java.util.Arrays;

public class MInFallPath3 {

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];

        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ld = Integer.MAX_VALUE, rd = Integer.MAX_VALUE;
                int up = matrix[i][j] + dp[i - 1][j];

                if (j - 1 >= 0) {
                    ld = matrix[i][j] + dp[i - 1][j - 1];
                }
                if (j + 1 < m) {
                    rd = matrix[i][j] + dp[i - 1][j + 1];
                }

                dp[i][j] = Math.min(up, Math.min(ld, rd));
            }
        }

        int mini = dp[n - 1][0];
        for (int j = 1; j < m; j++) {
            mini = Math.min(mini, dp[n - 1][j]);
        }
        return mini;
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][] {
                { 2, 1, 3 },
                { 6, 5, 4 },
                { 7, 8, 9 }
        };

        System.out.println(minFallingPathSum(matrix));
    }
}
