import java.util.LinkedList;
import java.util.Queue;

public class QueueFunctions {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();

        q1.offer(1);
        q1.poll();
        q1.offer(2);
        q1.offer(3);
        q1.poll();
        q1.offer(null);
        q1.offer(null);
        q1.poll();
        q1.offer(null);
        q1.offer(null);

        System.out.println(q1);

    }
}