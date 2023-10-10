package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class nodesBinaryTree {
    class Solution {

        public static ArrayList<Integer> v = new ArrayList<Integer>();

        public static void findKDistanceDownNode(Node root, int k)
        /*
         * Recursive function to find all the nodes at distance k in the
         * tree (or subtree) rooted with given root. See
         */
        {
            // Base Case
            if (root == null || k < 0)
                return;

            // If we reach a k distant node, add to vector
            if (k == 0) {
                v.add(root.data);
                return;
            }

            // Recur for left and right subtrees
            findKDistanceDownNode(root.left, k - 1);
            findKDistanceDownNode(root.right, k - 1);
        }

        public static int findKDistanceNode(Node root, int target, int k)
        // Finds all nodes at distance k from a given target node.
        // The k distant nodes may be upward or downward. This function
        // Returns distance of root from target node, it returns -1 if target
        // node is not present in tree rooted with root.
        {
            // Base Case 1: If tree is empty, return -1
            if (root == null)
                return -1;

            // If target is same as root. Use the downward function
            // to find all nodes at distance k in subtree rooted with
            // target or root
            if (root.data == target) {
                findKDistanceDownNode(root, k);
                return 0;
            }

            // Recur for left subtree
            int dl = findKDistanceNode(root.left, target, k);

            // Check if target node was found in left subtree
            if (dl != -1) {
                // If root is at distance k from target, add root value to vector
                // Note that dl is Distance of root's left child from target
                if (dl + 1 == k)
                    v.add(root.data);

                // Else go to right subtree and print all k-dl-2 distant nodes
                // Note that the right child is 2 edges away from left child
                else
                    findKDistanceDownNode(root.right, k - dl - 2);

                // Add 1 to the distance and return value for parent calls
                return 1 + dl;
            }

            // MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
            // Note that we reach here only when node was not found in left subtree
            int dr = findKDistanceNode(root.right, target, k);
            if (dr != -1) {
                if (dr + 1 == k)
                    v.add(root.data);
                else
                    findKDistanceDownNode(root.left, k - dr - 2);
                return 1 + dr;
            }

            // If target was neither present in left nor in right subtree
            return -1;
        }

        public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
            v.clear();

            findKDistanceNode(root, target, k);

            Collections.sort(v);

            return v;
        }
    };
}
