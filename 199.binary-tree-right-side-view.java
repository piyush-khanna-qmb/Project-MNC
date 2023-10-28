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
    static class Pair
    {
        int pos;
        TreeNode root;
        public Pair(TreeNode root, int pos)
        {
            this.root= root;
            this.pos= pos;
        }
    }

    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> ans= new ArrayList();
        if(root == null)
            return ans;
        
        Queue<Pair> q= new LinkedList();
        Map<Integer, Integer> tm= new HashMap();
        q.offer(new Pair(root, 0));
        int maxPos= 0;
        while(!q.isEmpty())
        {
            Pair yeWala= q.poll();
            TreeNode rt= yeWala.root;
            int pos= yeWala.pos;

            if(rt.right != null)
                q.offer(new Pair(rt.right, pos+1));
            if(rt.left != null)
                q.offer(new Pair(rt.left, pos+1));
            if(!tm.containsKey(pos))
            {
                tm.put(pos, rt.val);
                maxPos= Math.max(maxPos, pos);
            }
        }
        for(int i= 0; i<=maxPos; i++)
            ans.add(tm.get(i));
        
        return ans;
    }
}