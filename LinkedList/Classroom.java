import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}
