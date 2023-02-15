public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fib(n));

        // fibonacci series: 0 1 1 2 3 5 8 13 21 34 55 89
    }

    public static int fib(int n) {

        // this is inefficient code
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}