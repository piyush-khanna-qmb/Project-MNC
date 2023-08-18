/*
 * @lc app=leetcode id=1492 lang=java
 *
 * [1492] The kth Factor of n
 */

// @lc code=start
class Solution 
{
    public int kthFactor(int n, int k) 
    {
        if(k==1)
            return 1;
        if(k==n && n==2)
            return 2;
        if(k>=n || k<2)
            return -1;
        int c= 1;
        for(int i=2; i<= n/2; i++)
        {
            if(n%i == 0)
            {
                if(++c == k)
                    return i;
            }
        }
        if(++c == k)
            return n;
        return -1;    
    }
}
// @lc code=end