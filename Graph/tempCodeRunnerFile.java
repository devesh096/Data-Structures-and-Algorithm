import java.util.*;

public class Graph1 {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {

            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 5, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph) { // O(V+E)
        Queue<Integer> q = new java.util.LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0); // source = 0
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // visit

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }

    }

    public static void main(String[] args) {

        int V = 7; // total number of vertex
        ArrayList<Edge>[] graph = new ArrayList[V]; // array of array list
        createGraph(graph);

        System.out.println("BFS Traversal: ");
        bfs(graph);
        System.out.println();
        System.out.println("DFS Traversal : ");
        dfs(graph, 0, new boolean[V]);

        // for (int i = 0; i < V; i++) {
        // graph[i] = new ArrayList<>();

        // }

        // 2 neifgbour

        // for (int i = 0; i < graph[2].size(); i++) {
        // Edge e = graph[2].get(i); // src,dest,wt
        // System.out.println(e.dest);

        // }

    }
}