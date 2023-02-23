package GFG;

public class uniquePathsGrid {

    static int uniquePaths(int n, int m, int[][] grid) {

        int mod = 1000000007;

        // create a 2D-matrix and initializing
        // with value 0
        int[][] paths = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                paths[i][j] = 0;
            }
        }

        // Initializing the left corner if
        // no obstacle there
        if (grid[0][0] == 1)
            paths[0][0] = 1;

        // Initializing first column of
        // the 2D matrix
        for (int i = 1; i < n; i++) {
            // If not obstacle
            if (grid[i][0] == 1)
                paths[i][0] = paths[i - 1][0];
        }

        // Initializing first row of the 2D matrix
        for (int j = 1; j < m; j++) {

            // If not obstacle
            if (grid[0][j] == 1)
                paths[0][j] = paths[0][j - 1];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                // If current cell is not obstacle
                if (grid[i][j] == 1)
                    paths[i][j] = (paths[i - 1][j] % mod + paths[i][j - 1] % mod) % mod;
            }
        }

        // Returning the corner value
        // of the matrix
        return paths[n - 1][m - 1];
    }
};
