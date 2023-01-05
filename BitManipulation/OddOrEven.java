public class OddOrEven {

    public static void orrOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        /*
         * odd = lsb = 1
         * even = lsb = 0
         * 
         */

        orrOrEven(18);
        orrOrEven(11);

    }
}
