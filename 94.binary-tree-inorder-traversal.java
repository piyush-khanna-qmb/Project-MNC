/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
        if(root.left != null)
            traverse(root.left, ans);

        ans.add(root.val);

        if(root.right != null)
            traverse(root.right, ans);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        if(root == null)
            return new ArrayList();
        List<Integer> ans= new ArrayList();
        traverse(root, ans);
        return ans;
    }
}
// @lc code=end

