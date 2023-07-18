/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution 
{
    public int[] plusOne(int[] a) 
    {
        int n= a.length;
        if(a[n-1]!=9)
        {
            a[n-1]+=1;
            return a;
        }
        int p= n-1;
        while(p >= 0)
        {
            if(a[p] == 9)
            {
                a[p--]= 0;
            }
            else
            {
                a[p]+=1;
                return a;
            }
        }
        int k[]= new int[n+1];
        k[0]= 1;
        return k;
    }
}
// @lc code=end

