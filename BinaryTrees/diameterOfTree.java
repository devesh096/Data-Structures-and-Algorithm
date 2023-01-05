public class diameterOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
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

    public static int diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = findHeight(root.left) + findHeight(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(findHeight(root));
        System.out.println(diameter(root));

        // System.out.println(root.data);
        // countNode(root);
    }
}
