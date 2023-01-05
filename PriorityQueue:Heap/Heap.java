import java.util.ArrayList;

public class Heap {

    static class Heap1 {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index

            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) { // O(logn) //reverse the sign for dec order
                // swap

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;

            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIndex = i;

            if (left < arr.size() && arr.get(minIndex) >  arr.get(left)) {   //reverse
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {  //reverse
                minIndex = right;
            }
            if (minIndex != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
                heapify(minIndex);
            }
        }

        public int remove() {
            int data = arr.get(0);
            // step 1 - swap

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 - delete last
            arr.remove(arr.size() - 1);

            // step 3 heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        // get min in heap

        Heap1 h = new Heap1();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(10);

        while (!h.isEmpty()) { // heap sort

            System.out.println(h.peek());
            h.remove();
        }
    }
}
