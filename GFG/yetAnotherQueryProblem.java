package GFG;

import java.util.*;

public class yetAnotherQueryProblem {

    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int temp[][] = new int[N][N + 1];
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i; j < N; j++) {
                if (A[i] == A[j]) {
                    cnt++;
                }
            }
            temp[i][cnt]++;
        }
        for (int i = 0; i < N + 1; i++) {
            for (int j = 1; j < N; j++) {
                temp[j][i] += temp[j - 1][i];
            }
        }
        for (int i = 0; i < num; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int K = Q[i][2];
            arr.add((L == 0 ? temp[R][K] : temp[R][K] - temp[L - 1][K]));
        }
        return arr;
    }

}
