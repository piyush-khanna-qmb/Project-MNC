/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
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
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(tmp == null)
            return null;

        if(tmp.val == key)
            return rootKeChochle(root, key);;

        TreeNode tmp= root;
        while(tmp != null)
        {
            if(tmp.left!=null && tmp.left.val == key)
            {
                
            }
        }
    }
    private TreeNode rootKeChochle(TreeNode root, int key)
    {
        if(root.left == null)
            return rot.right;
        if(root.right == null)
            return root.left;
        
        TreeNode aakhri= aakhriNodeDedeMerkoBhainsdike(root.left);
        aakhri.right= root.right;
        return root.left;
    }
    private TreeNode aakhriNodeDedeMerkoBhainsdike(TreeNode root)
    {
        TreeNode tmp= root;
        while(tmp.right != null)
            tmp= tmp.right;
        return tmp;
    }
}
// @lc code=end

