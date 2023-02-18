class InvertBinaryTree {

    public void swapNode(TreeNode root) {

        if (root == null)
            return;

        swapNode(root.left);
        swapNode(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    public TreeNode invertTree(TreeNode root) {
        swapNode(root);

        return root;
    }
}