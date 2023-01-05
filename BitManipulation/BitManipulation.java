import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(5 & 6); // bitwise AND
        // 5 = 101
        // 4 = 100
        // 5&4 = 100 = 4
        System.out.println(5 | 6);

        // 5 = 101
        // 6 = 110
        // 5|6 = 111 = 7

        // BINARY XOR

        System.out.println(5 ^ 6);

        // 5 = 101
        // 6 = 110

        // 5^6 = 011

        // BINARY 1'S COMPLEMENT

        System.out.println(~5);

        // 5= 101
        // ~5 = 010

    }
}