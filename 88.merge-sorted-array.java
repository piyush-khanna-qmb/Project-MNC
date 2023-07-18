/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
//  Using Optimal Memory
import java.util.*;
class Solution 
{
    public void merge(int[] a1, int m, int[] a2, int n) 
    {
        int p= a1.length-1, l= m-1, r= n-1;
        while(l>=0 && r>=0)    
        {
            if(a1[l] < a2[r])
                a1[p--]= a2[r--];
            else
                a1[p--]= a1[l--];
        }
        if(l<0)
        {
            while(p>=0)
                a1[p--]= a2[r--];
        }
    }
}
// @lc code=end

