/*
 * @lc app=leetcode id=173 lang=java
 *
 * [173] Binary Search Tree Iterator
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
class BSTIterator 
{
    private Stack<TreeNode> stack;
    int size;
    public BSTIterator(TreeNode root) 
    {   
        stack= new Stack();
        TreeNode tmp= root;
        while(tmp != null)
        {
            stack.push(tmp);
            tmp= tmp.left;
        }
    }
    
    public int next() 
    {
        TreeNode yahi= stack.pop();
        if(yahi.right != null)
        {
            TreeNode tmp= yahi.right;
            while(tmp != null)
            {
                stack.push(tmp);
                tmp= tmp.left;
            }
        }
        return yahi.val;
    }
    
    public boolean hasNext() 
    {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

