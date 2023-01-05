import java.util.*;

public class countDistinctElements {
    public static void main(String[] args) {

        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        // unique elements : 4,3,2,5,6,7,1 count = 7
        int count = distinctElements(arr);

        System.out.println("No. of Distinct Elements : " + count);
    }

    public static int distinctElements(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }
}
