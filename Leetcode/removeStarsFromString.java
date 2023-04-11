import java.util.*;

public class removeStarsFromString {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                stack.pop();
            else {
                stack.add(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
