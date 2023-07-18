/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution
{
    public int maxProfit(int[] a) 
    {
        int m= Integer.MAX_VALUE, grPro= 0, pro, tPro= 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] < m)
            {
                m= a[i];
            }
            pro= a[i] - m;
            if(pro > grPro)
                grPro= pro;
            if(i<a.length-1 && a[i] > a[i+1])
            {
                tPro += grPro;
                m= a[i+1];
                grPro= 0;
            }
        }
        tPro+= grPro;
        
        return tPro;
    }
}
// @lc code=end

