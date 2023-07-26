/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
import java.util.Collections;
class Solution 
{
    private void reverse(int[] nums, int start, int end) 
    {
        while (start < end) 
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] a) 
    {
        int j, p=-1, n= a.length, tmp;
        
        for(j= n-2; j>=0; j--)
        {
            if(a[j+1] > a[j])
            {
                p= j;
                break;
            }
        }
        if(p==-1)
        {
            reverse(a, 0, n-1);
            return;
        }
        int min= p+1;
        for(j=j+1;j<n; j++)
        {
            if(a[j]>a[p] && a[j]<a[min])
                min= j;
        }
        tmp= a[min];
        a[min]= a[p];
        a[p]= tmp;
        reverse(a, p+1, n-1);
    }
}
// @lc code=end

