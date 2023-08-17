/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
class Solution 
{
    public int minMoves(int[] nums) 
    {
        int min= Integer.MAX_VALUE;
        int n= nums.length;
        int moves= 0;

        for(int i: nums)
            min= Math.min(min, i);
        
        for(int i: nums)
            moves+= i-min;
        
        return moves;
    }
}
// @lc code=end

