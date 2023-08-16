package GFG;

public class NCatalynNumber {
    class Solution {
        public static int findCatalan(int n) {
            // code here
            if (n == 0 || n == 1) {
                return 1;
            }

            long dp[] = new long[n + 1], mod = (long) (1e9) + 7;
            // Initializing dp[0] and dp[1] as 1
            dp[0] = dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = 0;
                for (int j = 0; j < i; j++) {
                    dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % mod) % mod;
                }
            }

            // returning the nth catalan number.
            return (int) dp[n];
        }
    }
}
