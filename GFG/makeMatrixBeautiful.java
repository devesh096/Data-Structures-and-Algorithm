package GFG;

public class makeMatrixBeautiful {
    class Solution {
        public static int findMinOperation(int N, int[][] matrix) {
            // code here
            int sumRow[] = new int[N];
            int sumCol[] = new int[N];

            // calculating sumRow[] and sumCol[] array.
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    sumRow[i] += matrix[i][j];
                    sumCol[j] += matrix[i][j];
                }
            }

            // finding maximum sum value in either row or in column.
            int maxSum = 0;
            for (int i = 0; i < N; ++i) {
                maxSum = Math.max(maxSum, sumRow[i]);
                maxSum = Math.max(maxSum, sumCol[i]);
            }

            int count = 0;
            for (int i = 0, j = 0; i < N && j < N;) {
                // finding minimum increment required in either row or column.
                int diff = Math.min(maxSum - sumRow[i], maxSum - sumCol[j]);

                // adding difference in corresponding cell,
                // sumRow[] and sumCol[] array.
                matrix[i][j] += diff;
                sumRow[i] += diff;
                sumCol[j] += diff;

                // updating the result.
                count += diff;

                // if ith row is satisfied, incrementing i for next iteration.
                if (sumRow[i] == maxSum)
                    ++i;

                // if jth column is satisfied, incrementing j for next iteration.
                if (sumCol[j] == maxSum)
                    ++j;
            }
            // returning the result.
            return count;
        }
    }
}
