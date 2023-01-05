import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println(findExponent(x, n));

    }

    public static int findExponent(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int ans = x;
        ans = ans * findExponent(x, n - 1);

        return ans;
    }
}
