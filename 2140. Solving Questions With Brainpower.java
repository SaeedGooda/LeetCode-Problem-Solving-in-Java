class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = 0; i < n; i++) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            int nextIndex = i + brainpower + 1;
            
            dp[i] = Math.max(dp[i], (i > 0 ? dp[i - 1] : 0));
            if (nextIndex < n) {
                dp[nextIndex] = Math.max(dp[nextIndex], dp[i] + points);
            } else {
                dp[n] = Math.max(dp[n], dp[i] + points);
            }
        }
        return Math.max(dp[n - 1], dp[n]);
    }

}