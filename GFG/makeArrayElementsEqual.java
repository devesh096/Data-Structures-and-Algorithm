package GFG;

public class makeArrayElementsEqual {

    public long minOperations(int N) {
        long ans = N / 2;
        ans *= (N + 1) / 2;
        return ans;
    }
}
