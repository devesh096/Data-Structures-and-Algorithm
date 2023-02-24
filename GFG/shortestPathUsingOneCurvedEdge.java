package GFG;

import java.util.*;

public class shortestPathUsingOneCurvedEdge {

    static class pair implements Comparable<pair> {
        int to;
        int number;

        pair(int t, int n) {
            number = n;
            to = t;
        }

        @Override
        public int compareTo(pair o) {
            return Integer.compare(number, o.number);
        }

    }

    static int[] dijkstra(int u, int b, int n, ArrayList<pair>[] adj) {
        int[] dis = new int[n + 1];
        for (int i = 0; i <= n; i++)
            dis[i] = 1000000001;

        PriorityQueue<pair> pq = new PriorityQueue<>();
        dis[u] = 0;
        pq.add(new pair(u, 0));

        while (!pq.isEmpty()) {
            pair cur = pq.poll();
            int v = cur.to;
            for (pair vs : adj[v]) {
                int y = vs.to;
                int w = vs.number;
                if (dis[y] > dis[v] + w) {
                    dis[y] = w + dis[v];
                    pq.add(new pair(y, dis[y]));
                }
            }
        }

        return dis;
    }

    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<pair>[] adj = new ArrayList[n + 1];
        ArrayList<ArrayList<Integer>> curved = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            int w = edges.get(i).get(2);
            int cw = edges.get(i).get(3);
            adj[u].add(new pair(v, w));
            adj[v].add(new pair(u, w));

            // curved edge weight
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(u);
            temp.add(v);
            temp.add(cw);
            curved.add(temp);
        }

        int[] da = dijkstra(a, b, n, adj);
        int[] db = dijkstra(b, a, n, adj);

        int ans = da[b];

        // ans = min distance from a -> b with at max one curved edge
        // current ans without curved edge from a -> b = da[b]

        for (int i = 0; i < m; i++) {
            int u = curved.get(i).get(0);
            int v = curved.get(i).get(1);
            int cw = curved.get(i).get(2);

            ans = Math.min(ans, da[u] + cw + db[v]);
            ans = Math.min(ans, da[v] + cw + db[u]);
        }

        if (ans >= 1000000001)
            return -1;
        return ans;
    }
};
