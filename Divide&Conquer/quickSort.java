public class quicksort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5, -5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    private static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int si, int ei) {
        //
        if (si >= ei) {
            return;
        }
        int pindx = partition(arr, si, ei);
        quickSort(arr, si, pindx - 1);
        quickSort(arr, pindx + 1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
}
