import java.util.*;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new java.util.ArrayList<Integer>();
        int row = matrix.length;
        if (row == 0)
            return list;
        int col = matrix[0].length;
        int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;

        while (l <= r && t <= b) {
            if (d == 0) {
                for (int i = l; i <= r; i++) {
                    list.add(matrix[t][i]);

                }
                t++;
                d = 1;

            } else if (d == 1) {

                for (int i = t; i <= b; i++) {
                    list.add(matrix[i][r]);
                }
                d = 2;
                r--;

            } else if (d == 2) {
                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                d = 3;
                b--;
            } else if (d == 3) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);

                }
                d = 0;
                l++;

            }

        }
        return list;
    }
}
