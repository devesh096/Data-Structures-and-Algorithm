import java.util.ArrayList;

public class swap2Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(456);
        list.add(156);
        list.add(6);
        list.add(4);
        list.add(64);
        list.add(46);

        System.out.println(list);
        swap(list, 0, 5);
        System.out.println(list);

    }

    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
