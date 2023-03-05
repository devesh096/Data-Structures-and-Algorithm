package GFG;

import java.util.*;

public class avoidExplosion {

    ArrayList<String> avoidExlosion(int mix[][], int n, int danger[][], int m) {
        ans = new ArrayList<>();
        par = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 0; i <= n; i++)
            par[i] = i;
        for (int i = 0; i < mix.length; i++) {
            int x = mix[i][0];
            int y = mix[i][1];
            int px = find(x), py = find(y);
            boolean bool = true;
            for (int j = 0; j < danger.length; j++) {
                int a = danger[j][0], b = danger[j][1];
                int pa = find(a), pb = find(b);
                if ((px == pa && py == pb) || (px == pb && py == pa)) {
                    bool = false;
                    break;
                }
            }
            if (bool)
                union(x, y);
            if (bool) {
                ans.add("Yes");
            } else {
                ans.add("No");
            }
        }
        return ans;
    }

    private ArrayList<String> ans;
    private int par[], rank[];

    private void union(int u, int v) {
        u = par[u];
        v = par[v];
        if (rank[u] > rank[v])
            par[v] = u;
        else if (rank[u] < rank[v])
            par[u] = v;
        else {
            par[u] = v;
            rank[v]++;
        }
    }

    private int find(int node) {
        if (par[node] == node)
            return node;
        return par[node] = find(par[node]);
    }

}
