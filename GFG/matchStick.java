package GFG;

public class matchStick {

    class Solution {
        static int matchGame(Long N) {

            // If not divisible by 5, then return the remainder
            // when divided by 5 else return -1
            if (N % 5 != 0)
                return (int) (N % 5);
            else
                return -1;
        }
    };
}
