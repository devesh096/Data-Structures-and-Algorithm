package GFG;

import java.util.*;

public class dominantPairs {

    public static int dominantPair(int n, int[] arr) {
        // code here
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n);
        int ans = 0;
        int right = n / 2;
        for (int left = 0; left < n / 2; left++) {
            while (right < n && arr[left] >= 5 * arr[right]) {
                right++;
            }
            ans += right - n / 2;
        }
        return ans;
    }
}
