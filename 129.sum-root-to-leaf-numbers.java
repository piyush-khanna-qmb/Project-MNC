/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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
    private void getto(int sum, TreeNode root, int totSum[])
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            totSum[0]+= (sum*10+root.val);
            return;
        }        
        getto(sum*10+root.val, root.left, totSum);
        getto(sum*10+root.val, root.right, totSum);
    }

    public int sumNumbers(TreeNode root) 
    {
        int totSum[]= new int[1];
        getto(0, root, totSum);
        return totSum[0];
    }
}
// @lc code=end

