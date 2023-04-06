package GFG;

public class equalLeftRightSubArray {

    int equalSum(int[] A, int N) {
        long rem = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            rem += A[i];
        }
        for (int i = 0; i < N; i++) {
            if (sum == (rem - A[i]))
                return i + 1;
            sum += A[i];
            rem -= A[i];
        }
        return -1;
    }
}
