package GFG;

public class countNumberOfHops {
    class Solution {
        // Function to count the number of ways in which frog can reach the top.
        static long countWays(int n) {
            // we use similar algorithm as Fibonacci series to find the
            // number of ways in which frog can reach the top.

            long mod = 1000000007;

            // base cases
            if (n == 1)
                return 1;
            if (n == 2)
                return 2;
            if (n == 3)
                return 4;

            // initializing base values.
            long a = 1, b = 2, c = 4, temp;

            for (int i = 4; i <= n; i++) {
                temp = (a + b + c) % mod;
                // updating a as b and b as c and c as temp (sum of a, b and c).
                a = b;
                b = c;
                c = temp;
            }
            // returning the result.
            return c;
        }

    }

}
