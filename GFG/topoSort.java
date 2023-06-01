package GFG;

public class topoSort {
    class Solution {
        // Function to return list containing vertices in Topological order.
        static int[] topoSort(int N, ArrayList<ArrayList<Integer>> list) {
            // using boolean array to mark visited nodes and currently
            // marking all the nodes as false.
            boolean visited[] = new boolean[N];
            Arrays.fill(visited, false);
            Stack<Integer> st = new Stack<>();

            // traversing over all the vertices.
            for (int i = 0; i < N; i++) {
                // if the current vertex is not visited, we call the topo function.
                if (!visited[i])
                    topo(list, i, visited, st);
            }
            int A[] = new int[st.size()];
            int i = -1;
            while (!st.isEmpty()) {
                // pushing elements of stack in list and popping them from stack.
                A[++i] = st.peek();
                st.pop();
            }
            // returning the list.
            return A;
        }

        static void topo(ArrayList<ArrayList<Integer>> list, int it,
                boolean visited[], Stack<Integer> s) {
            // marking the current vertex as visited.
            visited[it] = true;

            // traversing over the adjacent vertices.
            for (int i = 0; i < list.get(it).size(); i++) {
                // if any vertex is not visited, we call the function recursively.
                if (!visited[list.get(it).get(i)])
                    topo(list, list.get(it).get(i), visited, s);
            }
            // pushing the current vertex into the stack.
            s.push(it);
        }
    }
}
