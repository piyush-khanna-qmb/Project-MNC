/*
 * @lc app=leetcode id=124 lang=java
 *
 * [124] Binary Tree Maximum Path Sum
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
    private int f(TreeNode root, int maxi[])
    {
        if(root == null)
            return 0;
        
        int lsum= Math.max(0, f(root.left, maxi));
        int rsum= Math.max(0, f(root.right, maxi));
        maxi[0]= Math.max(maxi[0], lsum+rsum+root.val);
        return Math.max(lsum, rsum) + root.val;
    }

    public int maxPathSum(TreeNode root) 
    {
        if (root == null)
            return 1;
        int maxi[]= new int[1];
        f(root, maxi);
        return maxi[0];
    }
}
// @lc code=end
