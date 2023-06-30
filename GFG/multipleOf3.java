package GFG;

public class multipleOf3 {
    class Solution {
        int isDivisible(String s) {
            // code here
            long val = 0;
            char c[] = s.toCharArray();
            int x = 1;
            for (int i = c.length - 1; i >= 0; i--) {
                if (c[i] == '1')
                    val = (val + x) % 3;
                x = (x * 2) % 3;
            }
            if (val % 3 == 0)
                return 1;
            return 0;
        }
    }
}
