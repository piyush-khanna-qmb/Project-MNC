/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution 
{
    public List<Integer> findDuplicates(int[] arr) 
    {
        List<Integer> ans= new ArrayList();
        int n= arr.length;

        for(int i= 0; i<n; i++)
        {
            int ind= arr[i]%n - 1;
            arr[ind] += n;
        }

        for(int i= 0; i<n; i++)
        {
            if(arr[i] >= (n*2))
                ans.add(i+1);
        }

        return ans;
    }
}
// @lc code=end

