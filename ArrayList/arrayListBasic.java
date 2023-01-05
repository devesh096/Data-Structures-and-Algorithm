import java.util.ArrayList;

public class arrayListBasic {

    public static void main(String[] args) {
        // Java Collection Framework

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Character> list4 = new ArrayList<>();

        list.add(12);
        list.add(18);
        list.add(25);
        list.add(17);
        list.add(11);

        list2.add("Devesh");
        list2.add("Parwani");
        System.out.println(list);
        System.out.println(list2);

        System.out.println(list.get(1));
        System.out.println(list2.get(1));

        list.remove(4);
        System.out.println(list);

        list.set(3, 18);
        System.out.println(list);

        System.out.println(list.contains(122));

        list.add(3, 9);
        System.out.println(list);

    }
}