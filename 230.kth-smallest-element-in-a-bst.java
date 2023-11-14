/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    public int kthSmallest(TreeNode root, int k) 
    {
        if(root == null)
            return 0;
        
        int ans[]= new int[2];
        ans[1]= k;
        nikaaliyo(root, ans);
        return ans[0];
    }
    private void nikaaliyo(TreeNode root, int ans[])
    {
        if(root == null)
            return;
        
        nikaaliyo(root.left, ans);
        ans[1]--;
        if(ans[1] == 0)
        {
            ans[0]= root.val;
            return;
        }
        nikaaliyo(root.right, ans);
    }
}
// @lc code=end

