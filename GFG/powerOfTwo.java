package GFG;

public class powerOfTwo {
    class Solution {
        // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(long n) {

            if (n == 0) {
                return false;
            }

            // We use a counter variable to count number of set bits.
            int count = 0;
            while (n > 0) {
                // Increment of counter variable if we get 1 as the rightmost bit.
                count += (n & 1);
                // Right Shift n to remove the rightmost bit.
                n >>= 1;
            }
            // returning true if number of set bits is 1 otherwise false.
            return count == 1;

        }

    }
}
