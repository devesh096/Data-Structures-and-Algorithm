package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class shortestPathCyclicGraph {
    class Solution {
        class Pair {
            int v;
            int w;

            Pair(int v, int w) {
                this.v = v;
                this.w = w;
            }
        }

        int[] dijkstra(ArrayList<Pair> adj[], int n) {

            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
                public int compare(Pair p1, Pair p2) {
                    if ((p1.w - p2.w) > 0)
                        return 1;
                    else if ((p1.w - p2.w) < 0)
                        return -1;
                    else
                        return 0;
                }
            });

            pq.add(new Pair(0, 0));
            int d[] = new int[n];
            Arrays.fill(d, (int) 1e9);
            d[0] = 0;
            boolean vis[] = new boolean[n];

            while (!pq.isEmpty()) {
                Pair p1 = pq.poll();
                int u = p1.v;
                if (vis[u])
                    continue;
                vis[u] = true;

                for (Pair p : adj[u]) {
                    int v = p.v;
                    int w = p.w;
                    if ((d[u] + w) < d[v]) {
                        d[v] = d[u] + w;
                        pq.add(new Pair(v, d[v]));
                    }
                }
            }

            for (int i = 0; i < n; ++i) {
                if (d[i] == 1e9)
                    d[i] = -1;
            }
            return d;
        }

        public int[] shortestPath(int n, int m, int[][] edges) {

            ArrayList<Pair> adj[] = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < edges.length; i++) {
                adj[edges[i][0]].add(new Pair(edges[i][1], edges[i][2]));
            }
            return dijkstra(adj, n);

        }
    }
}
