package GFG;

public class predictColumn {
    class Solution {
        int columnWithMaxZeros(int arr[][], int N) {
            int idx = -1, val = 0;
            for (int j = 0; j < N; j++) {
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += 1 - arr[i][j];
                }
                if (val < sum) {
                    val = sum;
                    idx = j;
                }
            }
            return idx;
        }
    }
}
