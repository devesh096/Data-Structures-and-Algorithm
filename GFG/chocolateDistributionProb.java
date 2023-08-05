package GFG;

import java.util.*;

public class chocolateDistributionProb {
    class Solution {

        public long findMinDiff(ArrayList<Integer> a, int n, int m) {
            Collections.sort(a);

            int start = 0, end = 0;
            // Largest number of chocolates
            int mind = Integer.MAX_VALUE;

            // Find the subarray of size m such that
            // difference between last (maximum in case
            // of sorted) and first (minimum in case of
            // sorted) elements of subarray is minimum.
            for (int i = 0; i + m - 1 < n; i++) {
                int diff = a.get(i + m - 1) - a.get(i);
                if (mind > diff) {
                    mind = diff;
                    start = i;
                    end = i + m - 1;
                }
            }
            return a.get(end) - a.get(start);
        }

    }
}