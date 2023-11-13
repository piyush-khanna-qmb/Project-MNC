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
    private boolean kardiyo(TreeNode root, int min, int max)
    {   
        if(root == null)
            return true;
        if(root.val >= max || root.val <= min)
            return false;

        boolean leftH= kardiyo(root.left, min, root.val);
        boolean rightH= kardiyo(root.right, root.val, max);

        return leftH && rightH;
    }
    public boolean isValidBST(TreeNode root) 
    {
        if(root == null)
            return true;

        return kardiyo(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
// @lc code=end

