package GFG;

public class minimumOperations {
    class Solution {
        public int minOperation(int n) {
            int count = 0;
            while (n != 0) {
                // if n is even then it will be good to
                // reach n from n/2 by multiplying it by 2.
                if (n % 2 == 0)
                    n /= 2;
                // if n is odd then we can reach n from n-- only.
                else
                    n--;

                count++;
            }
            return count;
        }
    }
}
