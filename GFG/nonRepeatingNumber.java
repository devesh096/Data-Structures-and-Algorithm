package GFG;

public class nonRepeatingNumber {
    class Solution {
        public int[] singleNumber(int[] nums) {

            int diff = 0;
            for (int i : nums)
                diff = i ^ diff;
            // Get its last set bit
            diff &= -diff;
            // Pass 2 :
            int rets[] = { 0, 0 }; // this vector stores the two numbers we will return
            for (int num : nums) {
                if ((num & diff) == 0) // the bit is not set
                {
                    rets[0] ^= num;
                } else // the bit is set
                {
                    rets[1] ^= num;
                }
            }
            if (rets[0] > rets[1]) {
                int temp = rets[0];
                rets[0] = rets[1];
                rets[1] = temp;
            }
            return rets;
        }
    }
}
