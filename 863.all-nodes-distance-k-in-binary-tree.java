/*
 * @lc app=leetcode id=863 lang=java
 *
 * [863] All Nodes Distance K in Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    private int papaBanaDeYaar(Map<TreeNode, TreeNode> hm, TreeNode root)
    {
        int max= Integer.MIN_VALUE;
        Queue<TreeNode> q= new LinkedList();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size= q.size();
            for(int i= 0; i<size; i++)
            {
                TreeNode ye= q.poll();
                if (ye.val > max)
                    max= ye.val;
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
        return max;
    }

    private void bfsKarde(List<Integer> ls, Map<TreeNode, TreeNode> papaJi, TreeNode target, int k, Set<TreeNode> visited)
    {
        // Queue<TreeNode> q= new LinkedList();
        // q.offer(root);
        // int i= 0;
        // while(!q.isEmpty())
        // {
        //     if(i == k)
        //         break;
        //     int size= q.size();
        //     for(int j= 0; j<size; j++)
        //     {
        //         TreeNode ye= q.poll();
        //         if(ye.left != null && !vis[ye.left.val]) {
        //             q.offer(ye.left);
        //             vis[ye.val]= true;
        //         }
        //         if(ye.right != null && !vis[ye.right.val]) {
        //             q.offer(ye.right);
        //             vis[ye.val]= true;
        //         }
        //         if(papaJi.get(ye) != null && !vis[papaJi.get(ye).val]) {
        //             q.offer(papaJi.get(ye));
        //             vis[papaJi.get(ye).val]= true;
        //         }
        //     }
        //     i++;
        // }
        // for(TreeNode t: q)
        //     ls.add(t.val);
         Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.add(target);
        int distance = 0;
        
        while (!q.isEmpty() && distance != k) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current.left != null && !visited.contains(current.left)) {
                    q.offer(current.left);
                    visited.add(current.left);
                }
                if (current.right != null && !visited.contains(current.right)) {
                    q.offer(current.right);
                    visited.add(current.right);
                }
                TreeNode parent = papaJi.get(current);
                if (parent != null && !visited.contains(parent)) {
                    q.offer(parent);
                    visited.add(parent);
                }
            }
            distance++;
        }
        
        while (!q.isEmpty()) {
            ls.add(q.poll().val);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        List<Integer> ls= new ArrayList();
        if(target == null)
            return ls;
        Map<TreeNode, TreeNode> papaJi= new HashMap();
        int max= papaBanaDeYaar(papaJi, root);
        boolean vis[]= new boolean[max+1];
        bfsKarde(ls, papaJi, target, k, new HashSet());
        return ls;
    }
}
// @lc code=end

