package GFG;

public class bleakNumbers {

    class Solution {
        public int is_bleak(int n) {
            for (int i = 1; i <= Math.min(31, n); i++) {
                int number = n - i, cc = 0;
                while (number > 0) {
                    cc += number & 1;
                    number >>= 1;
                }
                if (cc == i) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
