public class nFibonacci {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.print(FibonacciAt(i) + " ");
        }

    }

    public static int FibonacciAt(int i) {

        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }

        return FibonacciAt(i - 1) + FibonacciAt(i - 2);

    }
}