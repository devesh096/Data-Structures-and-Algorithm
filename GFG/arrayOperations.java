package GFG;

public class arrayOperations {
    class Solution {
        public static int arrayOperations(int n, int[] arr) {
            // code here
            int count = 0, zero = 0;
            boolean isNonZero = false, isZeroFound = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    isZeroFound = true;
                    zero++;
                    if (isNonZero) {
                        count++;
                        isNonZero = false;
                    }
                } else {
                    isNonZero = true;

                }
            }
            if (isNonZero && isZeroFound) {
                count++;
            }

            if (zero == n)
                return 0;

            return count > 0 ? count : -1;
        }
    }
}
