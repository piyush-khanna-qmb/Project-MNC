/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
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
public class Codec 
{
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        if(root == null)
            return "";
        Queue<TreeNode> q= new LinkedList();
        String tt= ""+root.val+" ";
        q.offer(root);
        while(!q.isEmpty())
        {
            int s= q.size();
            for(int i= 0; i<s; i++)
            {
                TreeNode ye= q.poll();
                if(ye.left != null) {
                    q.offer(ye.left);
                    tt+= ""+ye.left.val+" ";
                }
                else
                    tt+= "n ";

                if(ye.right != null) {
                    q.offer(ye.right);
                    tt+= ye.right.val+" ";
                }
                else
                    tt+= "n ";
            }
        }
        int len= tt.length()-1;
        for(int i= tt.length()-1; i>=0; i--)
        {
            if(tt.charAt(i) != 'n' && tt.charAt(i)!= ' ')
            {
                len= i;
                break;
            }
        }
        System.out.println(tt);
        return tt.substring(0, len+1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data.length() == 0)
            return null;

        String vals[]= data.split(" ");
        int height= (int) (Math.log(vals.length-1)/Math.log(2));
        // for(int i= 0; i<=height; i++)
        // {
        //     if(!vals[i].equals("n"))
        //     {
        //         TreeNode ye= new TreeNode(Integer.parseInt(vals[i]));
        //         if(i==0)
        //             root= ye;
                
        //         TreeNode left= (vals[i*2+1].equals("n")) ? null : new TreeNode(Integer.parseInt(vals[i*2+1]));

        //         TreeNode right= (vals[i*2+2].equals("n")) ? null : new TreeNode(Integer.parseInt(vals[i*2+2]));

        //         ye.left= left;
        //         ye.right= right;
        //     }
        // }

        Queue<TreeNode> q= new LinkedList();
        TreeNode root= new TreeNode(Integer.parseInt(vals[0]));
        q.offer(root);
        int c= 0;
        while(!q.isEmpty() && c<=height)
        {
            int s= q.size();
            for(int i= 0; i<s; i++)
            {
                TreeNode ye= q.poll();
                if(ye == null)
                    continue;

                TreeNode left= (vals[(c*2)+1].equals("n")) ? null : new TreeNode(Integer.parseInt(vals[(c*2)+1]));

                TreeNode right= (vals[(c*2)+2].equals("n")) ? null : new TreeNode(Integer.parseInt(vals[(c*2)+2]));

                ye.left= left;
                ye.right= right;
                q.offer(left);
                q.offer(right);
                c++;
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

