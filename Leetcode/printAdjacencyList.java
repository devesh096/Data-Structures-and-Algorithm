import java.util.ArrayList;
import java.util.List;

public class printAdjacencyList {
    class Solution {
        public List<List<Integer>> printGraph(int V, int edges[][]) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i[] : edges) {
                graph.get(i[0]).add(i[1]);
                graph.get(i[1]).add(i[0]);
            }
            return graph;
        }
    }
}
