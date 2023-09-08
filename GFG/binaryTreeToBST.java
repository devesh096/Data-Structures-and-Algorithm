package GFG;

import java.util.Arrays;

public class binaryTreeToBST {

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class index {
        int x = 0;
    }

    class Solution {
        // Function to convert an array to a binary search tree
        void arrayToBST(int arr[], Node root, index index_ptr) {
            // Base case: return if root is null
            if (root == null)
                return;

            // Recursively convert left subtree
            arrayToBST(arr, root.left, index_ptr);

            // Assign value from array to current root node
            root.data = arr[index_ptr.x];

            // Increment index pointer
            index_ptr.x++;

            // Recursively convert right subtree
            arrayToBST(arr, root.right, index_ptr);
        }

        // Function to store inorder traversal of a tree in an array
        void storeInorder(Node node, int inorder[], index index_ptr) {
            // Base case: return if node is null
            if (node == null)
                return;

            // Recursively store inorder traversal of left subtree
            storeInorder(node.left, inorder, index_ptr);

            // Store data of current node in inorder array
            inorder[index_ptr.x] = node.data;

            // Increment index pointer
            index_ptr.x++;

            // Recursively store inorder traversal of right subtree
            storeInorder(node.right, inorder, index_ptr);
        }

        // Function to count the number of nodes in a tree
        int countNodes(Node root) {
            // Base case: return 0 if root is null
            if (root == null)
                return 0;

            // Recursively count nodes in left and right subtrees and add 1 for the root
            // node
            return countNodes(root.left) + countNodes(root.right) + 1;
        }

        // Function to convert a binary tree to a binary search tree
        Node binaryTreeToBST(Node root) {
            // Base case: return null if root is null
            if (root == null)
                return null;

            // Count the number of nodes in the tree
            int n = countNodes(root);

            // Create an array to store the inorder traversal of the tree
            int arr[] = new int[n];

            // Create an index pointer object
            index index = new index();

            // Store the inorder traversal of the tree in the array
            storeInorder(root, arr, index);

            // Sort the array in ascending order
            Arrays.sort(arr);

            // Reset the index pointer to 0
            index.x = 0;

            // Convert the sorted array back into a binary search tree
            arrayToBST(arr, root, index);

            // Return the root of the converted binary search tree
            return root;
        }
    }
}
