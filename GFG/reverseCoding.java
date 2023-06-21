package GFG;

public class reverseCoding {

    class Solution {
        static int sumOfNaturals(int n) {
            int MOD = 1_000_000_007;
            long sum = (((long) n * (n + 1)) % MOD) / 2; // Computing (n * (n + 1)) / 2 using long

            return (int) sum; // Return the result modulo MOD as an integer
        }
    }
}
