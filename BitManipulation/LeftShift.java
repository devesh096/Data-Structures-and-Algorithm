import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class LeftShift {
    public static void main(String[] args) {
        System.out.println(5 << 2);
        // a<<b = a*2^b
        // 5<<2 = 5*2^2 = 5*4 = 20

        /*
         * 5 = 00101
         * 5<<2 = 10100 = 20
         */
    }
}
