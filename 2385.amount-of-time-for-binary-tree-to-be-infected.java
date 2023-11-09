/*
 * @lc app=leetcode id=2385 lang=java
 *
 * [2385] Amount of Time for Binary Tree to Be Infected
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
    private TreeNode papaBanaade(Map<TreeNode, TreeNode> hm, TreeNode root, int target)
    {
        Queue<TreeNode> q= new LinkedList();
        q.offer(root);
        TreeNode chahiye= null;
        while(!q.isEmpty())
        {
            int s= q.size();
            for(int i= 0; i<s; i++)
            {
                TreeNode ye= q.poll();
                if(ye.val == target)
                    chahiye= ye;
                if(ye.left != null) {
                    hm.put(ye.left, ye);
                    q.offer(ye.left);
                }
                if(ye.right != null) {
                    hm.put(ye.right, ye);
                    q.offer(ye.right);
                }
            }
        }
        return chahiye;
    }

    public int amountOfTime(TreeNode root, int start) 
    {
        Map<TreeNode, TreeNode> hm= new HashMap();
        TreeNode target= papaBanaade(hm, root, start);
        int time= -1;
        Queue<TreeNode> q= new LinkedList();
        q.offer(target);
        Map<TreeNode, Boolean> vis= new HashMap();
        vis.put(target, true);
        do
        {
            int s= q.size();
            time++;
            for(int i= 0; i<s; i++)
            {
                TreeNode ye= q.poll();
                if(ye.left != null && vis.get(ye.left)==null)
                {
                    q.offer(ye.left);
                    vis.put(ye.left, true);
                }
                if(ye.right != null && vis.get(ye.right)==null)
                {
                    q.offer(ye.right);
                    vis.put(ye.right, true);
                }
                if(hm.get(ye)!= null && vis.get(hm.get(ye))==null)
                {
                    q.offer(hm.get(ye));
                    vis.put(hm.get(ye), true);
                }
            }
        } while(!q.isEmpty());
        return time;
    }
}
// @lc code=end