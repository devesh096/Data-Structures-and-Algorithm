package GFG;

import java.util.Stack;

public class reverseStack {
    class Solution {
        static void insert_at_bottom(Stack<Integer> s, int x) {
            if (s.size() == 0) {
                s.add(x);
            } else {
                int y = s.peek();
                s.pop();
                insert_at_bottom(s, x);
                s.add(y);
            }
        }

        static void fun(Stack<Integer> s) {
            if (s.size() > 0) {
                int x = s.peek();
                s.pop();
                fun(s);
                insert_at_bottom(s, x);
            }
        }

        static void reverse(Stack<Integer> s) {
            // add your code here
            fun(s);
        }

    }
}
