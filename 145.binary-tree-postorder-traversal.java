/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    private void traverse(List<Integer> ans, TreeNode root)
    {
        if(root == null)
            return;
        traverse(ans, root.left);
        traverse(ans, root.right);
        ans.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) 
    {
        if(root == null)
            return new ArrayList();
        List<Integer> ans= new ArrayList();
        traverse(ans, root);
        return ans;
    }
}
// @lc code=end

