/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    private void kardiyo(TreeNode root, boolean ultaade, List<List<Integer>> ans)
    {
        Queue<TreeNode> q= new LinkedList();
        q.offer(root);
        while(!q.isEmpty())
        {
            int lev= q.size();
            List<Integer> lis= new ArrayList();
            for(int i= 0; i<lev; i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                if(ultaade)
                    lis.add(0, q.poll().val);
                else
                    lis.add(q.poll().val);
            }
            ultaade = !ultaade;
            ans.add(lis);
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ans= new ArrayList();
        if(root == null)
            return ans;

        kardiyo(root, false, ans);
        return ans;
    }
}
// @lc code=end

