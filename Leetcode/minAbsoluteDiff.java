public class minAbsoluteDiff {

    public class TreeNode {
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

    class Solution {
        int prev = -100000, min = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode node) {
            if (node == null)
                return min;

            getMinimumDifference(node.left);
            min = Math.min(min, node.val - prev);
            prev = node.val;
            getMinimumDifference(node.right);

            return min;
        }
    }
}
