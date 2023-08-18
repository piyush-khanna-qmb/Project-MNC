/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start
class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        int M1,M2,M3,m1,m2;
        M1=M2=M3= Integer.MIN_VALUE;
        m1=m2= Integer.MAX_VALUE;

        for(int num: nums)
        {
            if(M1 < num) {
                M3= M2;
                M2= M1;
                M1= num;
            } else if(M2 < num) {
                M3= M2;
                M2= num;
            } else if(M3 < num)
                M3= num;

            if(m1>num)
            {
                m2= m1;
                m1= num;
            } else if(m2 > num) {
                m2= num;
            }
        }
        return Math.max(M1*M2*M3, m1*m2*M1);
    }
}
// @lc code=end