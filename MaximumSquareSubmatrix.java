public class MaximumSquareSubmatrix {
    public static int size(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[][] dp = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            dp[i][0] = a[i][0];
            if (dp[i][0] > max) max = dp[i][0];
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = a[0][j];
            if (dp[0][j] > max) max = dp[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    if (dp[i][j] > max) max = dp[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        System.out.println("Maximum square submatrix size: " + size(matrix));
    }
}
