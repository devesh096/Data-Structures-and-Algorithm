import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert

        hm.put("India", 140);
        hm.put("China ", 160);
        hm.put("USA ", 50);

        System.out.println(hm);

        hm.put("India", 150);

        System.out.println(hm); // hashmap are unordered maps thats why printing may not be in the order.

        int pop = hm.get("India"); // to get the value of the key
        System.out.println(pop);

        System.out.println(hm.get("Pak")); // null

        Boolean b = hm.containsKey("India"); // b = true
        System.out.println(b);

        System.out.println(hm.containsKey("Pak")); // false

        System.out.println(hm.remove("India")); // india will be removed from the key );

        System.out.println(hm);

        System.out.println(hm.size()); // it will return the number of keys in hashMap

        System.out.println(hm.isEmpty()); // return weather number of Key == 0

        hm.clear();

        System.out.println(hm.isEmpty());

    }
}