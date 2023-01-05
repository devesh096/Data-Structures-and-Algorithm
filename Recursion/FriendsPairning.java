import javax.security.auth.callback.TextOutputCallback;

// Friends PAiring Problem

public class FriendsPairning {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // int fnm1 = friendsPairing(n - 1);

        // int -fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // total
        // int totWays = fnm1 + pairWays;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(friendsPairing(3));
    }

}
