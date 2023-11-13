/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
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
class Solution 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root==null || root==p || root==q)
            return root;
        
        TreeNode leftWala= lowestCommonAncestor(root.left, p, q);
        TreeNode rightWala= lowestCommonAncestor(root.right, p, q);

        if(leftWala == null)
            return rightWala;
        if(rightWala == null)
            return leftWala;
        return root;    
    }
}
// @lc code=end

