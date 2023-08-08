package GFG;

import java.util.HashMap;

public class fractionPair {
    class Solution {
        public static int countFractions(int n, int[] numerator, int[] denominator) {
            // code here
            int ans = 0;
            HashMap<Integer, HashMap<Integer, Integer>> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = numerator[i], y = denominator[i];
                int g = gcd(x, y);
                x /= g;
                y /= g;
                if (hm.containsKey(y - x) && hm.get(y - x).containsKey(y)) {
                    ans += hm.get(y - x).get(y);
                }
                if (hm.containsKey(x)) {
                    HashMap<Integer, Integer> internalMap = hm.get(x);
                    internalMap.put(y, internalMap.getOrDefault(y, 0) + 1);
                } else {
                    HashMap<Integer, Integer> internalMap = new HashMap<>();
                    internalMap.put(y, 1);
                    hm.put(x, internalMap);
                }
            }
            return ans;
        }

        public static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    }
}
