/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution 
{
    private int numsOfOnes(String s)
    {
        int cnt= 0;
        for(char c: s.toCharArray()) 
        {
            if(c=='1')
                cnt++;
        }
        return cnt;
    }
    public int[] countBits(int n) 
    {
        int ans[]= new int[n+1];
        for(int i= 0; i<=n; i++)
            ans[i]= numsOfOnes(Integer.toBinaryString(i));
        
        return ans;
    }
}
// @lc code=end

