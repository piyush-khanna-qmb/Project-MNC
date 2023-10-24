/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
class Solution {

    private int f(TreeNode root)
    {
        if(root==null)
            return (int) 1e8;
        if(root.left == null && root.right == null)
            return 0;

        return 1 + Math.min(f(root.left) , f(root.right));
    }

    public int minDepth(TreeNode root) {
        if(root == null)    return 0;
        return 1 + f(root);
    }
}
// @lc code=end