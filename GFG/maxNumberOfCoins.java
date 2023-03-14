package GFG;

import java.util.*;

public class maxNumberOfCoins {

    int maxCoins(int N, ArrayList<Integer> arr) {
        arr.add(1);
        arr.add(0, 1);
        N = arr.size();
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], 0);
        }
        for (int i = N - 3; i > -1; i--)
            for (int j = i + 2; j < N; j++)
                for (int k = i + 1; k < j; k++)
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + arr.get(i) * arr.get(k) * arr.get(j));
        return dp[0][N - 1];
    }

}
