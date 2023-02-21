class Solution {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        int j = 0;
        int n = nums.length;
        if (target > nums[n - 1]) {
            return n;
        } else {
            while (nums[j] < target)
                j++;
        }
        return j;

    }
}