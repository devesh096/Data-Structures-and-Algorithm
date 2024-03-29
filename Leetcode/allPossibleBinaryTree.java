import java.util.ArrayList;
import java.util.List;

public class allPossibleBinaryTree {
    class Solution {
        public List<TreeNode> allPossibleFBT(int n) {
            List<TreeNode> res = new ArrayList<>();
            if (n == 1) {
                res.add(new TreeNode(0, null, null));
                return res;
            }
            for (int i = 1; i < n; i += 2) {
                List<TreeNode> lefts = allPossibleFBT(i);
                List<TreeNode> rights = allPossibleFBT(n - i - 1);
                for (TreeNode left : lefts) {
                    for (TreeNode right : rights) {
                        TreeNode root = new TreeNode(0);
                        root.left = left;
                        root.right = right;
                        res.add(root);
                    }
                }
            }
            return res;
        }
    }
}
