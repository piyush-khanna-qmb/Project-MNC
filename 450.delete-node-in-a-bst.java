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
        TreeNode tmp= root;
        TreeNode papaji= null;
        while (tmp != null)
        {
            if((tmp.right!=null && tmp.right.val == key) || (tmp.left!=null tmp.left == key))
            {
                papaji= tmp;
                break;
            }
            if(tmp.val > key)
                tmp= tmp.left;
            else
                tmp= tmp.right;
        }
        if(papaji == null)
            return null;
        
        if(papaji.left.val == key)
        {
            TreeNode baaju= papaji.right;
            if(papaji.left.left != null)
                addToExtremeRight(papaji.left, baaju);
            else
                papaji.left= papaji.left.right;
        }
        else    // right me key
        {
            TreeNode
        }
    }

    // private void doBullshit()
    // {

    // }

    private void addToExtremeRight(TreeNode root, TreeNode nn)
    {
        TreeNode tmp= root;
        while(tmp!=null && tmp.right != null)
            tmp= tmp.right;
        
        tmp.right= nn;
    }
}
// @lc code=end

