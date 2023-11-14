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
    public boolean findTarget(TreeNode root, int k) 
    {
        List<Integer> ls= new ArrayList();
        banaaiyo(ls, root);

        int i= 0, j= ls.size()-1;
        while(i<j)
        {
            if(ls.get(i) + ls.get(j) == k)
                return true;
            else if(ls.get(i)+ls.get(j) < k)
                i++;
            else
                j--;
        }
        return false;
    }
    private void banaaiyo(List<Integer> ls, TreeNode root)
    {
        if(root == null)
            return;
        banaaiyo(ls, root.left);
        ls.add(root.val);
        banaaiyo(ls, root.right);
    }
}
// @lc code=end

