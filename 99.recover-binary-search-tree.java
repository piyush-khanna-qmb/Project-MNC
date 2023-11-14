/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
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
    private void inOrderKarde(List<TreeNode> ls, TreeNode root)
    {
        if(root == null)
            return;
        inOrderKarde(ls, root.left);
        ls.add(root);
        inOrderKarde(ls, root.right);
    }
    public void recoverTree(TreeNode root) 
    {
        List<TreeNode> ls= new ArrayList();
        inOrderKarde(ls, root);

        TreeNode bhasadhbaaj1, bhasadhbaaj2, bhasadhbaaj3;
        bhasadhbaaj1= bhasadhbaaj2= bhasadhbaaj3= ls.get(0);

        for(int i= 0; i<ls.size()-1; i++)
        {
            if(bhasadhbaaj2 != ls.get(0) && ls.get(i).val > ls.get(i+1).val)
            {
                bhasadhbaaj2= ls.get(i);
                bhasadhbaaj3= ls.get(i+1);
            }
            else if(ls.get(i).val > ls.get(i+1).val)
            {
                bhasadhbaaj1= ls.get(i);
                bhasadhbaaj2= ls.get(i+1);
            }
        }
        if(bhasadhbaaj3 != ls.get(0))
        {
            int val= bhasadhbaaj1.val;
            bhasadhbaaj1.val= bhasadhbaaj3.val;
            bhasadhbaaj3.val= val;
        }
        else
        {
            int val= bhasadhbaaj1.val;
            bhasadhbaaj1.val= bhasadhbaaj2.val;
            bhasadhbaaj2.val= val;
        }
    }
}
// @lc code=end