package GFG;

import java.util.*;

public class maxLevelSumBinaryTree {

    public static int maxLevelSum(Node root) {
        if (root == null)
            return 0;
        int result = root.data;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            int count = q.size();
            int sum = 0;
            while (count-- > 0) {
                Node temp = q.peek();
                q.poll();
                sum = sum + temp.data;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            result = Math.max(sum, result);
        }
        return result;
    }

}
