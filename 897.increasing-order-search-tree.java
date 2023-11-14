/*
 * @lc app=leetcode id=897 lang=java
 *
 * [897] Increasing Order Search Tree
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
    public TreeNode increasingBST(TreeNode root) 
    {
        if(root == null)
            return root;

        List<TreeNode> ls= new ArrayList();
        inOrd(root, ls);

        TreeNode nayaRoot= ls.get(0);
        TreeNode tmp= nayaRoot;
        for(int i= 1; i<ls.size(); i++)
        {
            tmp.right= new TreeNode(ls.get(i).val);
            tmp= tmp.right;
        }
        return nayaRoot;
    }
    private void inOrd(TreeNode root, List<TreeNode> ls)
    {
        if(root == null)
            return;
        
        inOrd(root.left, ls);
        ls.add(root);
        inOrd(root.right, ls);
    }
}
// @lc code=end