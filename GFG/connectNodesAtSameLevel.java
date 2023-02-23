package GFG;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node nextRight;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        nextRight = null;
    }

    public class connectNodesAtSameLevel {

        public void connect(Node root) {
            // creating queue for level order traversal of tree
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            Node prev = null;
            // prev hold the value of previous node on the particular level
            Node end = root;
            Node nextend = null;
            // end will hold value of last node of a level
            // and nextend will store the same for the next level

            while (!q.isEmpty()) {
                Node temp = q.peek();
                q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                    nextend = temp.left;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    nextend = temp.right;
                }
                // storing all available nodes and updating nextend

                if (prev != null)
                    prev.nextRight = temp;
                // setting nextRight of previous node of that level

                if (temp == end) {
                    // If we've reached the end of a level, we need to :
                    // 1. Set nextRight of the node to NULL
                    temp.nextRight = null;
                    // 2. Make sure that it doesnt get connected to node of next level
                    prev = null;
                    // 3. Set the value of end for next level
                    end = nextend;
                }
                // If not at end of a level, we need to make sure that 'prev' gets
                // the address of current node before we move to the next one
                else
                    prev = temp;
            }
        }
    }
}
