import java.util.*;

public class frequencyGame {
    class Solution {
        // Function to find largest number with minimum frequency
        public static int LargButMinFreq(int arr[], int n) {
            // Your code here
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i : arr) {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
            int freq = Integer.MAX_VALUE;
            for (int i : hm.values()) {
                freq = Math.min(freq, i);
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                if (e.getValue() == freq) {
                    ans = Math.max(ans, e.getKey());
                }
            }
            return ans;
        }
    }
}
