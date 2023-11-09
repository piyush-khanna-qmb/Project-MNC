/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
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
    private int pooraHaiKya(TreeNode root)
    {
        TreeNode temp= root;
        int lefts= 0, rights= 0;
        while(temp.left != null)
        {
            lefts++;
            temp= temp.left;
        }
        temp= root;
        while(temp.right != null)
        {
            rights++;
            temp= temp.right;
        }
        return (lefts==rights) ? lefts : -1;
    }
    public int countNodes(TreeNode root) 
    {
        int height= pooraHaiKya(root);
        if(height != -1)
            return ((int) Math.pow(2, height)-1);
        
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
// @lc code=end

