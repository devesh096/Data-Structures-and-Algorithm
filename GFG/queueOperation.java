package GFG;

import java.util.Collections;
import java.util.Queue;

public class queueOperation {
    class Geeks {

        // Function to insert element into the queue
        static void insert(Queue<Integer> q, int k) {
            q.add(k);
        }

        // Function to find frequency of an element
        // rteturn the frequency of k
        static int findFrequency(Queue<Integer> q, int k) {
            return Collections.frequency(q, k);
        }

    }
}
