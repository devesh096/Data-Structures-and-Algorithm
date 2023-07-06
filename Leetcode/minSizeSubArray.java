public class minSizeSubArray {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int ans = nums.length + 1;
            int sum = 0;
            int st = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                while (sum >= target && st <= i) {
                    ans = Math.min(ans, i - st + 1);
                    sum -= nums[st++];
                }
            }
            return ans == nums.length + 1 ? 0 : ans;
        }
    }
}
