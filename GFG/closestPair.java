package GFG;

import java.util.ArrayList;

public class closestPair {

    class Solution {
        public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
            int temp = n;
            n = m;
            m = temp;
            int diff = Integer.MAX_VALUE;

            // res_l and res_r are result indexes from ar1[] and ar2[]
            // respectively
            int res_l = 0, res_r = 0;

            // Start from left side of ar1[] and right side of ar2[]
            int l = 0, r = n - 1;
            while (l < m && r >= 0) {
                // If this pair is closer to x than the previously
                // found closest, then update res_l, res_r and diff
                if (Math.abs(arr[l] + brr[r] - x) < diff) {
                    res_l = l;
                    res_r = r;
                    diff = Math.abs(arr[l] + brr[r] - x);
                }

                // If sum of this pair is more than x, move to smaller
                // side
                if (arr[l] + brr[r] > x)
                    r--;
                else // move to the greater side
                    l++;
            }

            ArrayList<Integer> v = new ArrayList<>();

            v.add(arr[res_l]);
            v.add(brr[res_r]);
            return v;
        }
    }
}
