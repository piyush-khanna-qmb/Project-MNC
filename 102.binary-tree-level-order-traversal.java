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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans= new ArrayList();
        if(root == null)
            return ans;
        
        Queue<TreeNode> q= new LinkedList();
        q.offer(root);

        while(!q.isEmpty())
        {
            int lev= q.size();
            List<Integer> mid= new ArrayList();
            for(int i= 0; i<lev; i++)
            {
                TreeNode yahi= q.poll();
                mid.add(yahi.val);
                if(yahi.left != null)
                    q.offer(yahi.left);
                if(yahi.right != null)
                    q.offer(yahi.right);
            }
            ans.add(mid);
        }
        return ans;
    }
}
// @lc code=end

