/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec 
{
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    if (root == null) {
        return "";
    }

    Queue<TreeNode> q = new LinkedList<>();
    StringBuilder result = new StringBuilder();

    q.offer(root);
    while (!q.isEmpty()) {
        int s = q.size();
        for (int i = 0; i < s; i++) {
            TreeNode current = q.poll();

            if (current != null) {
                result.append(current.val).append(" ");
                q.offer(current.left);
                q.offer(current.right);
            } else {
                result.append("n ");
            }
        }
    }

    System.out.println(result.toString());
    return result.toString();
}

    public TreeNode deserialize(String data) {
    if (data.length() == 0) {
        return null;
    }

    String[] vals = data.split(" ");
    Queue<TreeNode> q = new LinkedList<>();
    TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
    q.offer(root);

    int i = 1; // Start from index 1 since the root is already processed
    while (!q.isEmpty() && i < vals.length) {
        int s = q.size();
        for (int j = 0; j < s && i < vals.length; j++) {
            TreeNode current = q.poll();

            if (!vals[i].equals("n")) {
                current.left = new TreeNode(Integer.parseInt(vals[i]));
                q.offer(current.left);
            }
            i++;

            if (i < vals.length && !vals[i].equals("n")) {
                current.right = new TreeNode(Integer.parseInt(vals[i]));
                q.offer(current.right);
            }
            i++;
        }
    }

    return root;
}

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end