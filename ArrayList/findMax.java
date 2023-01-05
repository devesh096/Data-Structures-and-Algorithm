import java.util.*;

public class findMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(11);
        list.add(5);
        list.add(7);
        list.add(38);
        list.add(17);
        list.add(31);
        list.add(34);
        list.add(1);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }

        System.out.println("The Maximum Value in the Array List is " + max);

    }
}
