import java.util.*;

public class climbingStairs {

    static int n = 8;

    public static int countways(int n, int[] arr) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = countways(n - 1, arr) + countways(n - 2, arr);
        return arr[n];

    }

    public static int countWaysTab(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[0] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {

        int[] arr = new int[n + 1];

        Arrays.fill(arr, -1);
        System.out.println(countways(n, arr));
        System.out.println(countWaysTab(n));
    }
}
