/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    private void traverse(TreeNode root, List<Integer> ans)
    {
        if(root == null)
            return;
        
        ans.add(root.val);
        traverse(root.left, ans);
        traverse(root.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) 
    {
        if(root == null)
            return new ArrayList();
    
        List<Integer> ans= new ArrayList();
        traverse(root, ans);
        return ans;
    }
}
// @lc code=end

