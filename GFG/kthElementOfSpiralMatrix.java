package GFG;

import java.util.ArrayList;

public class kthElementOfSpiralMatrix {
    class Solution {

        int findK(int a[][], int n, int m, int k) {
            int top = 0;
            int left = 0;
            int right = m - 1;
            int bottom = n - 1;
            int dir = 0;

            ArrayList<Integer> AA = new ArrayList<Integer>();
            while (top <= bottom && left <= right) {
                if (dir == 0) {
                    for (int i = left; i <= right; i++) {
                        AA.add(a[top][i]);
                    }
                    top++;
                    dir = 1;

                }
                if (dir == 1) {
                    for (int i = top; i <= bottom; i++) {
                        AA.add(a[i][right]);
                    }
                    right--;
                    dir = 2;

                }
                if (dir == 2) {
                    for (int i = right; i >= left; i--) {
                        AA.add(a[bottom][i]);
                    }
                    bottom--;
                    dir = 3;
                }
                if (dir == 3) {
                    for (int i = bottom; i >= top; i--) {
                        AA.add(a[i][left]);
                    }
                    left++;
                    dir = 0;
                }

            }

            return AA.get(k - 1);
        }
    }
}
