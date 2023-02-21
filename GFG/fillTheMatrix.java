package GFG;

public class fillTheMatrix {

    public static int minIteration(int N, int M, int x, int y) {
        // code here
        int max = 0;
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= M; j++)
                max = Math.max(max, Math.abs(x - i) + Math.abs(y - j));
        return max;
    }
}
