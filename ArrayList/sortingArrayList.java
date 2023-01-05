import java.util.ArrayList;
import java.util.Collections;

public class sortingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(112);
        list.add(1);
        list.add(2);
        list.add(127);
        list.add(12);
        list.add(18);

        System.out.println(list);

        Collections.sort(list); // increasing Order

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // comparator is a function logic
        System.out.println(list);// decreasing order

    }
}
