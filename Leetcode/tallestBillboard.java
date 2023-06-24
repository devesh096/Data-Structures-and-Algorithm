import java.util.HashMap;
import java.util.Map;

public class tallestBillboard {
    class Solution {

        public int tallestBillboard(int[] rods) {

            Map<String, Integer> map = new HashMap<>();
            int sum = 0;
            for (int rod : rods) {
                sum += rod;
            }
            return helper(rods, 0, 0, sum, map);
        }

        private int helper(int[] rods, int index, int diff,
                int sum, Map<String, Integer> map) {

            // Base case: no rods remaining
            if (index == rods.length)
                return (diff == 0) ? 0 : Integer.MIN_VALUE;

            // Create a unique key for the current state
            String key = index + "+" + diff;

            // Check if the result is already computed
            if (map.containsKey(key))
                return map.get(key);

            // Exclude the current rod
            int exclude = helper(rods, index + 1, diff, sum, map);

            // Use the current rod on the taller support
            int taller = helper(rods, index + 1,
                    diff + rods[index], sum, map) + rods[index];

            // Use the current rod on the shorter support
            int shorter = helper(rods, index + 1,
                    diff - rods[index], sum, map);

            // Compute the maximum height for the current state
            int maxHeight = Math.max(exclude, Math.max(taller, shorter));

            // Store the computed result in the map
            map.put(key, maxHeight);
            return maxHeight;
        }
    }
}
