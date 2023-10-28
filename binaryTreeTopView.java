/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/

import java.util.*;

public class Solution 
{
    static class Pair
    {
        TreeNode tn;
        int pos;
        public Pair(TreeNode TN, int POS)
        {
            tn= TN;
            pos= POS;
        }
    }

    public static List<Integer> getTopView(TreeNode root) 
    {
        List<Integer> ans= new ArrayList();
        if(root == null)
            return ans;
        
        Map<Integer, Integer> tm= new TreeMap();
        Queue<Pair> q= new LinkedList();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair yeWala= q.poll();
            TreeNode tn= yeWala.tn;
            int pos= yeWala.pos;

            if(tn.left != null)
                q.offer(new Pair(tn.left, pos-1));
            if(tn.right != null)
                q.offer(new Pair(tn.right, pos+1));

            if(!tm.containsKey(pos))
                tm.put(pos, tn.data);
        }
        for(int pos: tm.keySet())
            ans.add(tm.get(pos));

        return ans;
    }
}
