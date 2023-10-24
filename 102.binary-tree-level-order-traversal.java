/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    private void f(TreeNode root, List<List<Integer>> ans, List<Integer> ls, Queue<Integer> q, int height)
    {
        if(root == null)
            return;
        TreeNode yeNode= q.poll();
        if(ls.size() > (int) Math.pow(2, height))
        {
            ans.add(ls);
            ls.clear();
        }
        if(root.left != null)
            yeNode.add(root.left);
        if(root.right!= null)
            yeNode.add(root.right);
        f(q.poll(), )
    }

    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        Queue<Integer> q= new Queue();
        List<List<Integer>> ans= new ArrayList();
        f()
        return ans;
    }
}
// @lc code=end

