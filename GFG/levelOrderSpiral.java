package GFG;

import java.util.ArrayList;

public class levelOrderSpiral {
    class Spiral {
        // Function to find the height of the tree.
        int height(Node node) {
            // base case for recursion.
            if (node == null)
                return 0;

            // finding height of left subtree recursively.
            int l = 1 + height(node.left);

            // finding height of right subtree recursively.
            int r = 1 + height(node.right);

            // taking the maximum as height of tree.
            if (l > r)
                return l;
            else
                return r;
        }

        // Function to do level order traversal of tree in spiral form.
        void printGivenLevel(ArrayList<Integer> result, Node node, int level, boolean ltr) {
            // base case for recursion.
            if (node == null)
                return;

            // if level is 1, we push the data in the list.
            if (level == 1)
                result.add(node.data);

            else if (level > 1) {
                // if ltr is true, we call the spiral function recursively
                // for the left subtrees first and then for right subtrees.
                if (ltr != false) {
                    printGivenLevel(result, node.left, level - 1, ltr);
                    printGivenLevel(result, node.right, level - 1, ltr);
                }
                // else we call for right subtrees first and then left subtrees.
                else {
                    printGivenLevel(result, node.right, level - 1, ltr);
                    printGivenLevel(result, node.left, level - 1, ltr);
                }
            }
        }

        // Function to return a list containing the level order
        // traversal in spiral form.
        ArrayList<Integer> findSpiral(Node node) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            if (node == null)
                return result;
            int h = height(node);
            int i;
            boolean ltr = false;
            // for each level, we do the spiral traversal.
            for (i = 1; i <= h; i++) {
                printGivenLevel(result, node, i, ltr);
                ltr = !ltr;
            }
            // returning the list.
            return result;
        }

    }
}
