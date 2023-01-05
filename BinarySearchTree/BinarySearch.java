public class BinarySearch {
    public static int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length);
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {

        int index = low + (high - low) / 2;
        if (high >= low) {
            if (nums[index] == target) {
                return index;
            } else if (nums[index] < target) {

                return binarySearch(nums, target, index + 1, high);
            } else {

                return binarySearch(nums, target, low, index - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        System.out.println(search(arr, 18));

    }
}
