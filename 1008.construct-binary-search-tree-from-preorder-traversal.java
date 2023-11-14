/*
 * @lc app=leetcode id=1008 lang=java
 *
 * [1008] Construct Binary Search Tree from Preorder Traversal
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
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        if(preorder.length == 0)
            return null;
        TreeNode root= new TreeNode(preorder[0]);
        int i[]= {1};
        banaiyoBe(root, preorder, i, Integer.MAX_VALUE);
        return root;
    }
   private void banaiyoBe(TreeNode root, int preorder[], int i[], int max) 
   {
        if (i[0] == preorder.length)
            return;
        if (preorder[i[0]] < root.val)
        {
            root.left = new TreeNode(preorder[i[0]]);
            i[0]++;
            banaiyoBe(root.left, preorder, i, root.val);
        } 
        if (i[0] < preorder.length && preorder[i[0]] < max) 
        {
            root.right = new TreeNode(preorder[i[0]]);
            i[0]++;
            banaiyoBe(root.right, preorder, i, max); // Corrected this line
        }
    }
}

// @lc code=end