import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(18);
        list.add(25);
        list.add(42);
        list.add(31);

        System.out.println(list.size()); // 5

        // print the arrayList

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
