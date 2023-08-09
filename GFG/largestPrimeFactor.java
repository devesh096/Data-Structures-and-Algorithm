package GFG;

public class largestPrimeFactor {
    class Solution {
        static long largestPrimeFactor(int N) {
            long num = 2;
            // loop till sqrt(N)
            while ((num * num) <= N)
                if (N % num == 0) // if num divides N evenly
                    N /= num; // divide N by num
                else
                    num++; // increase num if it don't divide N
            return N;
        }
    }
}
