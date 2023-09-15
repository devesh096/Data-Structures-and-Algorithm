package GFG;

public class partitionEqualSubset {
    class Solution {
        static int equalPartition(int N, int arr[]) {
            int sum = 0;
            for (int i = 0; i < N; i++)
                sum = sum + arr[i];

            // If sum is odd, cannot have equal partition
            if (sum % 2 == 1)
                return 0;

            // Calculate target sum for equal partition
            sum = sum / 2;

            // Create a boolean dp array to track possible sums
            boolean[][] dp = new boolean[N + 1][sum + 1];

            // Base case: if sum is 0, then it's possible to have an empty set with sum 0
            for (int i = 0; i < dp.length; i++)
                dp[i][0] = true;

            // Base case: if there are no elements, it's not possible to have any sum other
            // than 0
            for (int i = 1; i < dp.length; i++)
                dp[0][i] = false;

            // Fill in the dp array with possible sums
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (arr[i - 1] > j) {
                        // If current number is larger than current sum, exclude it and check previous
                        // row
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        // Include current number and check if remaining sum can be achieved with
                        // previous numbers
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                    }
                }
            }

            // Return 1 if target sum is achievable, 0 otherwise
            return (dp[N][sum] ? 1 : 0);
        }
    }
}
