package GFG;

public class countTotalSetBits {

    class Solution {
        public static long countBits(long N) {
            long count = 0;
            for (int i = 0; i < 31; i++) {
                int x = 1 << i; // calculate the ith bit
                long y = (N + 1) / (x * 2) * x; // count the number of set bits up to the ith bit
                long z = (N + 1) % (x * 2) - x; // count the number of set bits in the ith bit
                count += y + Math.max(z, 0); // add the counts to the total
            }
            return count;

        }
    }
}
