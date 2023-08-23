package GFG;

import java.util.ArrayList;

public class stringInGrid {
    class Solution {
        public int[][] searchWord(char[][] grid, String word) {
            // Code here
            int row = grid.length;
            int col = grid[0].length;
            int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
            int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
            ArrayList<int[]> A = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (search2D(grid, i, j, word.toCharArray(), x, y)) {
                        A.add(new int[] { i, j });
                    }
                }
            }
            int ans[][] = new int[A.size()][];
            int in = 0;
            for (var i : A) {
                ans[in++] = i;
            }
            return ans;
        }

        public boolean search2D(char grid[][], int row, int col, char word[], int x[], int y[]) {
            int R = grid.length;
            int C = grid[0].length;
            // If first character of word doesn't match with
            // given starting point in grid.
            if (grid[row][col] != word[0])
                return false;

            int len = word.length;

            // Search word in all 8 directions starting from (row,col)
            for (int dir = 0; dir < 8; dir++) {
                // Initialize starting point for current direction
                int k, rd = row + x[dir], cd = col + y[dir];

                // First character is already checked, match remaining
                // characters
                for (k = 1; k < len; k++) {
                    // If out of bound break
                    if (rd >= R || rd < 0 || cd >= C || cd < 0)
                        break;

                    // If not matched, break
                    if (grid[rd][cd] != word[k])
                        break;

                    // Moving in particular direction
                    rd += x[dir];
                    cd += y[dir];
                }

                // If all character matched, then value of must
                // be equal to length of word
                if (k == len)
                    return true;
            }
            return false;
        }
    }
}
