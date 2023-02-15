package GFG;

//GFG daily on 15th Feb 2023.
class geeksIsland {
    int water_flow(int[][] mat, int N, int M) {
        // Write your code here
        boolean indian[][] = new boolean[N][M];
        boolean arabian[][] = new boolean[N][M];

        for (int i = 0; i < N; i++)
            dfs(mat, indian, i, 0, N, M);
        for (int i = 0; i < M; i++)
            dfs(mat, indian, 0, i, N, M);
        for (int i = 0; i < N; i++)
            dfs(mat, arabian, i, M - 1, N, M);
        for (int i = 0; i < M; i++)
            dfs(mat, arabian, N - 1, i, N, M);

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (indian[i][j] && arabian[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    void dfs(int mat[][], boolean vis[][], int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j])
            return;
        vis[i][j] = true;

        if (i > 0 && !vis[i - 1][j] && mat[i - 1][j] >= mat[i][j]) {
            dfs(mat, vis, i - 1, j, n, m);
        }
        if (i < n - 1 && !vis[i + 1][j] && mat[i + 1][j] >= mat[i][j]) {
            dfs(mat, vis, i + 1, j, n, m);
        }
        if (j > 0 && !vis[i][j - 1] && mat[i][j - 1] >= mat[i][j]) {
            dfs(mat, vis, i, j - 1, n, m);
        }
        if (j < m - 1 && !vis[i][j + 1] && mat[i][j + 1] >= mat[i][j]) {
            dfs(mat, vis, i, j + 1, n, m);
        }
    }
}
