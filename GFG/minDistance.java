package GFG;

public class minDistance {
    class Solution {
        int minDist(int a[], int n, int x, int y) {
            int recent_x = -1;
            int recent_y = -1;
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] == x) {
                    recent_x = i;

                    // Checking both recent X and Y is found in the array or not
                    if (recent_y != -1)
                        ans = Math.min(Math.abs(recent_x - recent_y), ans);
                } else if (a[i] == y) {
                    recent_y = i;

                    // Checking both recent X and Y is found in the array or not
                    if (recent_x != -1)
                        ans = Math.min(Math.abs(recent_x - recent_y), ans);
                }
            }

            // If ans is not updated then either x or y, or both are not present in
            // the array
            if (ans == Integer.MAX_VALUE)
                return -1;
            return ans;
        }
    }
}
