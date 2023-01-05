import java.util.*;
import java.util.Comparator;

/*
 * You are given n pairs of numbers. In every pair, the first number is
 *  always smaller than the second number. 
 *  A pair (c, d) can come after pair (a, b) if b < c.
  Find the longest chain which can be formed from a given set of pairs.
  pairs =
(5, 24)(39, 60)(5, 28)(27, 40) (50, 90)

 */

public class ChainOfPairs {

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sorting the 2d array on the basis of column 1
        int chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected pair end

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("max length of the chain is = " + chainLen);

    }
}
