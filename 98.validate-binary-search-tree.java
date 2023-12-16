/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
    private boolean validity(TreeNode root, long min, long max)
    {
        if(root == null)
            return true;
        if(root.val >= max || root.val <= min)
            return false;   

        boolean lefth= validity(root.left, min, root.val);
        boolean righth= validity(root.right, root.val, max);

        return lefth && righth;
    }

    public boolean isValidBST(TreeNode root) 
    {
        return validity(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
// @lc code=end

