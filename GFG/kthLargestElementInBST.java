package GFG;

public class kthLargestElementInBST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    class Solution {
        int count = 0; // variable to keep track of the count
        int result = -1; // variable to store the result

        void kthLargestUtil(Node root, int k) {

            if (root == null || count >= k) // base case: if root is null or count is greater than or equal to k
                return;
            kthLargestUtil(root.right, k); // recursively call the function on the right child

            count++; // increment the count

            if (count == k) { // if count is equal to k
                result = root.data; // update the result with the data value of current root
                return;
            }
            kthLargestUtil(root.left, k); // recursively call the function on the left child
        }

        int kthLargest(Node root, int k) {
            kthLargestUtil(root, k); // call the utility function to find the kth largest element
            return result; // return the result
        }
    }
}
