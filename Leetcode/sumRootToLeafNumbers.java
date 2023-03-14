
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class sumRootToLeafNumbers {
    static int total;

    public static int sumNumbers(TreeNode root) {
        total = 0;
        findSum(root, 0);
        return total;
    }

    public static void findSum(TreeNode root, int sum) {

        if (root == null) {
            return;
        }

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            total += sum;
            return;
        }

        findSum(root.left, sum);
        findSum(root.right, sum);

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);

        t1.left = new TreeNode(9);
        t1.right = new TreeNode(0);
        t1.left.left = new TreeNode(5);
        t1.left.right = new TreeNode(1);

        System.out.println(sumNumbers(t1));
    }
}
