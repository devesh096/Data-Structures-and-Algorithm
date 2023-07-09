package GFG;

public class smallestPositiceMissingNumber {
    class Solution {
        // Function that puts all non-positive (0 and negative) numbers on left
        // side of arr[] and return count of such numbers.
        static int segregateArr(int arr[], int n) {
            int j = 0, i;
            for (i = 0; i < n; i++) {
                if (arr[i] <= 0) {
                    // changing the position of negative numbers and 0.
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // incrementing count of non-positive integers.
                    j++;
                }
            }
            return j;
        }

        // Finding the smallest positive missing number in an array
        // that contains only positive integers.
        static int findMissingPositive(int arr[], int st, int end) {

            // marking arr[i] as visited by making arr[arr[i]-1] negative.
            // note that 1 is subtracted because indexing starts from 0 and
            // positive numbers start from 1.
            for (int i = st; i < end; i++) {
                if (Math.abs(arr[i]) + st - 1 < end && arr[Math.abs(arr[i]) + st - 1] > 0)
                    arr[Math.abs(arr[i]) + st - 1] = -1 * arr[Math.abs(arr[i]) + st - 1];
            }

            for (int i = st; i < end; i++) {
                if (arr[i] > 0) {
                    // returning the first index where value is positive.
                    // st is subtracted because we do not have to consider negative numbers present
                    // at the start of array.
                    // 1 is added because indexing starts from 0.
                    return i - st + 1;
                }
            }
            return end - st + 1;
        }

        // Function to find the smallest positive number missing from the array.
        static int missingNumber(int arr[], int size) {
            // first separating positive and negative numbers.
            int shift = segregateArr(arr, size);

            // shifting the array to access only positive part.
            // calling function to find result and returning it.
            return findMissingPositive(arr, shift, size);
        }

    }

}
