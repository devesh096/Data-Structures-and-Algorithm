package GFG;

import java.util.Stack;

public class deleteMiddleElementStack {
    class Solution {
        // Function to delete middle element of a stack.
        public void deleteMid_util(Stack<Integer> s, int sizeOfStack, int current) {
            // if current pointer is half of the size of stack then we
            // are accessing the middle element of stack.
            if (current == sizeOfStack / 2) {
                s.pop();
                return;
            }
            // storing the top element in a variable and popping it.
            int x = s.peek();
            s.pop();
            current += 1;

            // calling the function recursively.
            deleteMid_util(s, sizeOfStack, current);

            // pushing the elements (except middle element) back
            // into stack after recursion calls.
            s.push(x);
        }

        public void deleteMid(Stack<Integer> s, int sizeOfStack) {
            deleteMid_util(s, sizeOfStack, 0);
        }

    }
}
