
//import java.util.HashSet;
import java.util.*;

public class HashSet2_Iterators {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Bhopal");
        cities.add("Kurukshetra");
        cities.add("Mandsaur");
        cities.add("Ahmedabad");
        cities.add("Pune");

        Iterator i = cities.iterator();

        while (i.hasNext()) { // hasNext functions returns wether it has next value or not
            System.out.println(i.next());

        }
        System.out.println();
        for (String city : cities) { // using enhanced for loops to print hashSet values
            System.out.println(city);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Bhopal");
        lhs.add("Kurukshetra");
        lhs.add("Mandsaur");
        lhs.add("Ahmedabad");
        lhs.add("Pune");

        System.out.println("Linked Hash Set" + lhs); // LinkedHashSet always print the the values in the order in which
                                                     // they were added.
        System.out.println();
        System.out.println("HashSet" + cities);
    }
}
