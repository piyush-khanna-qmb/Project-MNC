/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
//  Using Extra Memory
import java.util.*;
class Solution 
{
    public void merge(int[] a1, int m, int[] a2, int n) 
    {
        List<Integer> l1= new ArrayList();
        int p1= 0, p2= 0;
        while(p1<m && p2<n)
        {
            if(a1[p1] < a2[p2]) 
            {
                l1.add(a1[p1]);
                p1++;
            } 
            else 
            {
                l1.add(a2[p2]);
                p2++;
            }
        } 
        if(p1<m)
        {
            while(p1<m)
                l1.add(a1[p1++]);
        }
        else if(p2<n)
        {
            while(p2<n)
                l1.add(a2[p2++]);
        }
        for(int i= 0; i<m+n; i++)
        {
            a1[i]= l1.get(i);
        }
    }
}
// @lc code=end

