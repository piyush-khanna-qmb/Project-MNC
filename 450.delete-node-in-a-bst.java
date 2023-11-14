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
        if(root == null)
            return null;

        if(root.val == key)
            return rootKeChochle(root);

        TreeNode tmp= root;
        while(tmp != null)
        {
            if(key < tmp.val)
            {
                if(tmp.left!=null && tmp.left.val == key)
                {
                    tmp.left= rootKeChochle(tmp.left);
                    break;
                }
                else
                    tmp= tmp.left;
            }
            else
            {
                if(tmp.right!=null && tmp.right.val == key)
                {
                    tmp.right= rootKeChochle(tmp.right);
                    break;
                }
                else
                    tmp= tmp.right;
            }
        }
        return root;
    }
    private TreeNode rootKeChochle(TreeNode root)
    {
        if(root.left == null)
            return root.right;
        if(root.right == null)
            return root.left;
        
        TreeNode lastChild= root.right;
        TreeNode aakhri= aakhriNodeDedeMerkoBhainsdike(root.left);
        aakhri.right= lastChild;
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

