import java.util.*;

public class pairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // brute force
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 10) {
                    count++;
                    System.out.println("Pair Found at " + i + " " + j + " i.e ");
                    System.out.println(list.get(i) + " + " + list.get(j) + " = 10.");
                }
            }
        }
        System.out.println("Total Pairs = " + count);

    }
}
