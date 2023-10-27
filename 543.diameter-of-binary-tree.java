/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
        
        int lm= f(root.left, maxi);
        int rm= f(root.right, maxi);
        maxi[0]= Math.max(maxi[0], lm+rm);

        return 1 + Math.max(lm,rm);
    }

    public int diameterOfBinaryTree(TreeNode root) 
    {
        int maxi[]= new int[1];
        maxi[0]= 0;
        f(root, maxi);
        return maxi[0];
    }
}
// @lc code=end

