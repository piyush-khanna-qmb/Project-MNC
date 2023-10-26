/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    private int heightDedeBhainKL(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(heightDedeBhainKL(root.left) , heightDedeBhainKL(root.right));
    }
    
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;
        return heightDedeBhainKL(root.left) - heightDedeBhainKL(root.right) <= 1;
    }
}
// @lc code=end

