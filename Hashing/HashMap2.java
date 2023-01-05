import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India ", 150);
        hm.put("China ", 170);
        hm.put("Pakistan ", 50);
        hm.put("Nepal  ", 30);
        hm.put("England ", 40);
        hm.put("Indonesia ", 10);

        // Iterate
        // hm.entrySet();
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = " + k + ", Values = " + hm.get(k));
        }

        System.out.println("Using hm.entrySet() Function ");
        System.out.println(hm.entrySet());

    }
}
