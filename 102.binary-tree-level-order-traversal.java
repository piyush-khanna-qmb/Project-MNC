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
        Queue<TreeNode> q= new LinkedList();
        List<List<Integer>> ans= new ArrayList();
        if(root == null)
            return ans;

        q.offer(root);

        while(!q.isEmpty())
        {
            int lev= q.size();
            List<Integer> andarKiList= new ArrayList();
            for(int i= 0; i<lev; i++)
            {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                
                andarKiList.add(q.poll().val);
            }
            ans.add(andarKiList);
        }
        return ans;
    }
}
// @lc code=end

