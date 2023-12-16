/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution 
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        String intString= Integer.toBinaryString(n);
        int c= 0;
        for(char ch: intString.toCharArray())
            if(ch == '1')
                c++;
        
        return c;
    }
}
// @lc code=end