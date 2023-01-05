
/*
 * Keys are Sorted
 * Time Complexity
 * insert remove get - O(logn)
 * Internally they are created using Red Black Trees which are self balanced
 * 
 */
import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Devesh", 12);
        tm.put("Himanshu", 17);
        tm.put("Deepali", 11);
        tm.put("Iteesha", 18);
        tm.put("Saad", 38);
        tm.put("Abhishek", 45);

        System.out.println(tm); // in sorted Order , sorted on the basis of keys

    }

}
