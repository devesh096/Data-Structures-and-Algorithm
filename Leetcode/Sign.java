public class Sign {
    public int arraySign(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                counter++;
            }
        }
        return counter % 2 == 0 ? 1 : -1;
    }
}
