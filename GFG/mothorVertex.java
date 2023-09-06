package GFG;

import java.util.ArrayList;

public class mothorVertex {
    class Solution {
        static void DFSUtil(ArrayList<ArrayList<Integer>> g, int v, boolean[] visited) {
            // marking current vertex as visited.
            visited[v] = true;

            // iterating over the adjacent vertices.
            for (int x : g.get(v)) {
                // if any vertex is not visited, we call dfs function recursively.
                if (!visited[x]) {
                    DFSUtil(g, x, visited);
                }
            }
        }

        // Function to find a Mother Vertex in the Graph.
        public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
            // boolean list to mark the visited nodes and initially all are
            // initialized as not visited.
            boolean[] visited = new boolean[V];

            // variable to store last finished vertex (or mother vertex).
            int v = -1;

            // iterating over all the vertices
            for (int i = 0; i < V; i++) {
                // if current vertex is not visited, we call the dfs
                // function and then update the variable v.
                if (!visited[i]) {
                    DFSUtil(adj, i, visited);
                    v = i;
                }
            }

            // we reset all the vertices as not visited.
            boolean[] check = new boolean[V];

            // calling the dfs function to do DFS beginning from v to check
            // if all vertices are reachable from it or not.
            DFSUtil(adj, v, check);

            // iterating on boolean list and returning -1 if
            // any vertex is not visited.
            for (boolean val : check) {
                if (!val) {
                    return -1;
                }
            }
            // returning mother vertex.
            return v;
        }
    }
}
