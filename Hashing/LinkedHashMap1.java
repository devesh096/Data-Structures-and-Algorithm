import java.util.*;
/*
 * 
 * The only difference between HashMap and LinkedHashmap is that 
 * ordered is maintained in LinkedHashMap but order is not maintained 
 * in Hasmaps coz in Linked Hashmap the data is stored in Array of Doubly 
 * Linked List.
 */

public class LinkedHashMap1 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Devesh", 12);
        lhm.put("Himanshu", 17);
        lhm.put("Digvijay", 8);

        System.out.println(lhm);  //ordered is maintained



    }
}
