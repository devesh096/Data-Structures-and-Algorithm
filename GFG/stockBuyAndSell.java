package GFG;

public class stockBuyAndSell {
    class Solution {
        public static int stockBuyAndSell(int n, int[] prices) {
            int ans = 0;
            int st = prices[0], end = prices[0];
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    end = prices[i];
                } else {
                    ans += end - st;
                    st = prices[i];
                    end = st;
                }
            }
            ans += end - st;
            return ans;
        }
    }
}
