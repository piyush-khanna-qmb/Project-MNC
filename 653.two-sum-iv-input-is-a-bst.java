/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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
    static class BinaryIterator
    {
        Stack<TreeNode> seedha;
        Stack<TreeNode> ulta;
        public BinaryIterator(TreeNode root)
        {
            seedha= new Stack();
            ulta= new Stack();
            TreeNode tmp= root;
            while(tmp != null)
            {
                seedha.push(tmp);
                tmp= tmp.left;
            }
            tmp= root;
            while(tmp != null)
            {
                ulta.push(tmp);
                tmp= tmp.right;
            }
        }
        int next()
        {
            TreeNode yahi= seedha.pop();
            if(yahi.right != null)
            {
                TreeNode tmp= yahi.right;
                while(tmp != null)
                {
                    seedha.push(tmp);
                    tmp= tmp.left;
                }
            }
            return yahi.val;
        }
        int prev()
        {
            TreeNode yahi= ulta.pop();
            if(yahi.left != null)
            {
                TreeNode tmp= yahi.left;
                while(tmp != null)
                {
                    ulta.push(tmp);
                    tmp= tmp.right;
                }
            }
            return yahi.val;
        }
        boolean hasNext()
        {
            return !seedha.isEmpty();
        }
        boolean hasPrev()
        {
            return !ulta.isEmpty();
        }
    }

    public boolean findTarget(TreeNode root, int k) 
    {
        BinaryIterator it= new BinaryIterator(root);
        int agla= it.next();
        int pichhla= it.prev();
        while(agla > pichhla )
        {
            if(agla+pichhla == k)
                return true;
            else if(agla+pichhla < k)
                agla= (it.hasNext()) ? it.next() : -100000;
            else
                pichhla= (it.hasPrev()) ? it.prev() : 100000;
        }
        return false;
    }
}
// @lc code=end

