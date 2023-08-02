import java.util.ArrayList;
import java.util.List;

public class permutation {
    class Solution {
        private List<List<Integer>> ans = new ArrayList<>();

        private void recur(int[] nums, int i) {
            if (i == nums.length) {
                List<Integer> temp = new ArrayList<Integer>();
                for (int num : nums)
                    temp.add(num);
                ans.add(temp);
                return;
            }
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                recur(nums, i + 1);
                swap(nums, i, j);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public List<List<Integer>> permute(int[] nums) {
            recur(nums, 0);
            return ans;
        }
    }
}
