package GFG;

import java.util.*;

public class reversingTheEquation {
    class Solution {

        String reverseEqn(String S) {
            // your code here
            char s[] = S.toCharArray();
            StringBuilder res = new StringBuilder();
            int n = S.length();
            int i = n - 1;

            Stack<Character> st = new Stack<>();

            // traversing the string in reverse
            while (i >= 0) {
                if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/') {
                    while (!st.isEmpty()) {
                        res.append(st.pop());
                    }
                    res.append(s[i]);
                } else
                    st.push(s[i]);
                i--;
            }

            // appending the last number/variable if any
            while (!st.isEmpty()) {
                res.append(st.pop());
            }

            return res.toString();
        }
    }
}
