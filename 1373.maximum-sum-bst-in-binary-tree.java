/*
 * @lc app=leetcode id=1373 lang=java
 *
 * [1373] Maximum Sum BST in Binary Tree
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
public class Solution {
    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        validateBST(root);
        return maxSum;
    }

    private Result validateBST(TreeNode node) {
        if (node == null) {
            return new Result(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Result left = validateBST(node.left);
        Result right = validateBST(node.right);

        if (left.isValid && right.isValid && node.val > left.max && node.val < right.min) {
            int sum = node.val + left.sum + right.sum;
            maxSum = Math.max(maxSum, sum);
            return new Result(true, sum, Math.min(node.val, left.min), Math.max(node.val, right.max));
        } else {
            return new Result(false, 0, 0, 0);
        }
    }

    private static class Result {
        boolean isValid;
        int sum;
        int min;
        int max;

        Result(boolean isValid, int sum, int min, int max) {
            this.isValid = isValid;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
}
// @lc code=end

