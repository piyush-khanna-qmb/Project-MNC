/*
 * @lc app=leetcode id=987 lang=java
 *
 * [987] Vertical Order Traversal of a Binary Tree
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
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
        List<List<Integer>> ans= new ArrayList();
        if(root == null)
            return ans;
        Map<Integer, List<Integer>> jojo= new HashMap();
        Queue<Integer> pos= new LinkedList();
        Queue<TreeNode> nodes= new LinkedList();

        nodes.offer(root);
        pos.offer(0);
        int minPos= 0, maxPos= 0;
        while(!nodes.isEmpty())
        {
            TreeNode yeNode= nodes.poll();
            int position= pos.poll();
            if(jojo.get(position) == null)
                jojo.put(position, new ArrayList());
            jojo.get(position).add(yeNode.val);
            minPos= Math.min(minPos, position);
            maxPos= Math.max(maxPos, position);

            if(yeNode.left!=null)
            {
                nodes.offer(yeNode.left);
                pos.offer(position-1);
            }
            if(yeNode.right!=null)
            {
                nodes.offer(yeNode.right);
                pos.offer(position+1);
            }
        }
        for(int i= minPos; i<=maxPos; i++)
            ans.add(semi);
        
        return ans;
    }
}
// @lc code=end

