class Solution {
    static class pair {
        int ele;
        int bit_count;

        pair(int e, int b) {
            this.ele = e;
            this.bit_count = b;
        }
    }

    public static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public static int[] sort(HashMap<Integer, Integer> map, int arr[]) {
        int size = arr.length;
        // lets implement bubble sort in here
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (map.get(arr[i]) > map.get(arr[j]))
                    swap(i, j, arr);
                else if (map.get(arr[i]) == map.get(arr[j])) {
                    if (arr[i] > arr[j])
                        swap(i, j, arr);
                }
            }
        }
        return arr;
    }

    public int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int bits = Integer.bitCount(arr[i]);
            map.put(arr[i], bits);
        }
        // System.out.println(map);
        return sort(map, arr);
    }
}