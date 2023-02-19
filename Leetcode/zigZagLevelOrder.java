import java.util.*;

class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        travel(res, 0, root);
        return res;
    }

    private void travel(List<List<Integer>> res, int level, TreeNode cur) {
        if (cur == null)
            return;
        if (res.size() <= level) {
            res.add(new ArrayList<Integer>());
        }
        if (level % 2 == 0) {
            res.get(level).add(cur.val);
        } else {
            res.get(level).add(0, cur.val);
        }
        travel(res, level + 1, cur.left);
        travel(res, level + 1, cur.right);
    }
}