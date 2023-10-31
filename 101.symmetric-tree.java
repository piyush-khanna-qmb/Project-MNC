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
    private boolean checkKariyo(TreeNode s, TreeNode t)
    {
        if(s == null || t == null)
            return s==t;
        
        return s.val==t.val && checkKariyo(s.left, t.right) && checkKariyo(s.right, t.left);
    }
    
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
            return true;
        
        return checkKariyo(root, root);
        
    }
}