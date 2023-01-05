public class arraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 0 };
        System.out.println(isArraySorted(arr, 0));

    }

    public static boolean isArraySorted(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isArraySorted(arr, i + 1);
    }

}
