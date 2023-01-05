import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Bhopal");
        ts.add("Pune");
        ts.add("Ahmedabad");
        ts.add("Kurukshetra");
        // ts.add(null); //TreeSet does does not accept null values as TreeSet sort the
        // values in ascending order.

        System.out.println(ts); // TreeSet will Always print the value in Ascending Order
    }
}
