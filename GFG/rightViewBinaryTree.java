package GFG;

import java.util.ArrayList;

public class rightViewBinaryTree {
    class Solution {
        int max_level = 0;

        // Function to get the right view of the binary tree.
        void rightViewUtil(ArrayList<Integer> arr, Node node, int level) {
            // if root is null, we simply return.
            if (node == null)
                return;

            // if this is the last node of its level then it is in the right view.
            if (max_level < level) {
                // storing data of current node in list.
                arr.add(node.data);
                max_level = level;
            }

            // calling function recursively for right and left
            // subtrees of current node.
            rightViewUtil(arr, node.right, level + 1);
            rightViewUtil(arr, node.left, level + 1);
        }

        // Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> rightView(Node node) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            rightViewUtil(arr, node, 1);
            // returning the list.
            return arr;
        }
    }
}
