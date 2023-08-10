package GFG;

// This is Repeated on 11th Aug 2023
public class coinChange {

    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        boolean[][] dp = new boolean[K + 1][target + 1];
        dp[0][0] = true;
        for (int i = 1; i < K + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                for (int l : coins) {
                    if (j < l)
                        continue;
                    dp[i][j] |= dp[i - 1][j - l];
                }
            }
        }
        return dp[K][target];
    }
}
