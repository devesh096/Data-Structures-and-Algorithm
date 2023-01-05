public class ithBit {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        n = n | bitMask;

        return n;

    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);

        n = (n & bitMask);

        return n;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {

        /*
         * 12, 3
         * 12 = 1100
         * 3rd bit of 12 = 1
         */

        System.out.println(getIthBit(12, 0));
        System.out.println(getIthBit(12, 1));
        System.out.println(getIthBit(12, 2));
        System.out.println(getIthBit(12, 3));

        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(18, 3, 1));
        System.out.println(clearIBit(15, 2));

        // 18 = 10010
        // 11010 = 26

    }

}
