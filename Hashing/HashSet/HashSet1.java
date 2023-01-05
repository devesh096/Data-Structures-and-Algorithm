import java.util.*;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);
        hs.remove(2);
        if (hs.contains(2)) {
            System.out.println("set contains 2");
        } else {
            System.out.println("set does not contains 2");
        }

        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());


        
    }
}