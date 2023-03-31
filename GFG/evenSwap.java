package GFG;

import java.util.*;

public class evenSwap {

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void sort(int[] arr, int i, int j) {
        // sorting the subarray
        Arrays.sort(arr, i, j);
        // reversing for descending order
        while (i < j) {
            swap(arr, i++, --j);
        }
    }

    int[] lexicographicallyLargest(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && arr[j] % 2 == arr[j - 1] % 2) {
                j++;
            }
            // sorting this part in given lexicographical way
            sort(arr, i, j);
            i = j;
        }
        return arr;
    }
}
