public class firstOccurance {

    public static int searchArray(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return searchArray(arr, key, i + 1);

    }

    public static int lastOccurance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 3, 10, 2, 5, 3, 3 };

        System.out.println(searchArray(arr, 10, 0));

        System.out.println(lastOccurance(arr, 3, 0));
    }
}
