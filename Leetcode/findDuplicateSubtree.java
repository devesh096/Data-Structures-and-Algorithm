import java.util.*;

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

public class findDuplicateSubtree {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, List<TreeNode>> map = new HashMap<String, List<TreeNode>>();
        List<TreeNode> dups = new ArrayList<TreeNode>();
        serialize(root, map);
        for (List<TreeNode> group : map.values())
            if (group.size() > 1)
                dups.add(group.get(0));
        return dups;
    }

    private String serialize(TreeNode node, Map<String, List<TreeNode>> map) {
        if (node == null)
            return "";
        String s = "(" + serialize(node.left, map) + node.val + serialize(node.right, map) + ")";
        if (!map.containsKey(s))
            map.put(s, new ArrayList<TreeNode>());
        map.get(s).add(node);
        return s;
    }

}
