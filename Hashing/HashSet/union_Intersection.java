import java.util.*;
/*
 * In this question we will find the union and intersection of two arrays
 * using HashSets and printing the count of union and intersections 
 */

public class union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };

        int[] arr2 = { 6, 3, 9, 2, 4, 2 };

        System.out.println("count of union : " + union(arr1, arr2));
        // union - {7,3,9,6,2,4} count = 6

        System.out.println("\ncount of intersection : " + intersection(arr1, arr2));

    }

    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        System.out.println(hs);
        return hs.size();
    }

    public static int intersection(int[] arr1, int[] arr2) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                System.out.print(arr2[i] + " ");
                hs.remove(arr2[i]);
            }

        }
        return count;
    }
}
