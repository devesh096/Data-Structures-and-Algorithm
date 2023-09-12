package GFG;

public class perfectNumbers {
    class Solution {
        static int isPerfectNumber(long N) {
            // code here
            long sum = 1;

            // Find all divisors and add them
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    if (i == N / i)
                        sum += i;
                    else {
                        sum += i;
                        sum += N / i;
                    }
                }
            }

            // If sum of divisors is equal to
            // N, then N is a perfect number
            if (sum == N && N != 1)
                return 1;
            else
                return 0;
        }
    };
}
