package GFG;

public class maxMinHeight {

    public boolean isvalid(int[] a, int n, int k, int w, long mid) {
        long[] ps = new long[n];
        Arrays.fill(ps, 0);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0)
                ps[i] += ps[i - 1];
            if (a[i] + ps[i] < mid) {
                long e = mid - a[i] - ps[i];
                ans += e;
                ps[i] += e;
                if (i + w < n)
                    ps[i + w] -= e;
            }
        }
        return (ans <= k);
    }

    public long maximizeMinHeight(int n, int k, int w, int[] a) {
        long ans = 0;
        long l = 0, h = (long) 1e14;
        while (l <= h) {
            long mid = (l + h) / 2;
            if (isvalid(a, n, k, w, mid)) {
                l = mid + 1;
                ans = mid;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

}
