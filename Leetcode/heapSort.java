public class heapSort {
    class Solution {
        // Function to build a Heap from array.
        void buildHeap(int arr[], int n) {
            // calling heapify function for values from half to first index.
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);
        }

        // Heapify function to maintain heap property.
        void heapify(int arr[], int n, int i) {
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            // if left or right child is greater than current element,
            // we store its position.
            if (l < n && arr[l] > arr[largest])
                largest = l;
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // if largest is not equal to i, we swap the values at their position.
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                // calling function recursively for the largest variable.
                heapify(arr, n, largest);
            }
        }

        // Function to sort an array using Heap Sort.
        public void heapSort(int arr[], int n) {
            // calling function to build heap with array.
            buildHeap(arr, n);
            for (int i = n - 1; i >= 0; i--) {
                // swapping values at current and first index.
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                // calling heapify function for first index.
                heapify(arr, i, 0);
            }
        }
    }

}
