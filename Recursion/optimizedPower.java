import java.lang.StackWalker.Option;

public class optimizedPower {

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, n / 2);

        int halfPowerSq = halfPower * halfPower;

        // if n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {

        System.out.println(optimizedPower(2, 5));

    }

}
