package GFG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class bfsOfGraph {
    class Solution {
        // Function to return Breadth First Traversal of given graph.
        public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // boolean list to mark all the vertices as not visited.
            boolean visited[] = new boolean[V];

            int s = 0;
            // initially we mark first vertex as visited(true).
            visited[s] = true;

            ArrayList<Integer> res = new ArrayList<>();

            // creating a queue for BFS and pushing first vertex in queue.
            LinkedList<Integer> q = new LinkedList<Integer>();
            q.add(s);

            while (q.size() != 0) {
                // adding front element in output list and popping it from queue.
                s = q.poll();
                res.add(s);

                // traversing over all the connected components of front element.
                Iterator<Integer> i = adj.get(s).listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    // if they aren't visited, we mark them visited and add to
                    // queue.
                    if (!visited[n]) {
                        visited[n] = true;
                        q.add(n);
                    }
                }
            }
            // returning the output list.
            return res;
        }
    }
}
