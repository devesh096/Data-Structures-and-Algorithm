import java.util.*;

public class QueueB {
    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        /*
         * Queue is a Interface in Java Collection Framework
         * Queue is Implemented either using LinkedList or
         * using array deque
         */
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}