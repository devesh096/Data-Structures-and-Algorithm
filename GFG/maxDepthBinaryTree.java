package GFG;

public class maxDepthBinaryTree {

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class Solution {
        public static int maxDepth(Node root) {
            // code here
            return findHeight(root);
        }

        public static int findHeight(Node root) {

            if (root == null) {
                return 0;
            }

            int left = findHeight(root.left);
            int right = findHeight(root.right);

            int myHeight = Math.max(left, right) + 1;
            return myHeight;
        }

    }
}
