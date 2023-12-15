/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> ans= new ArrayList();
        int n= nums.length;
        // marking karlo
        for(int i= 0; i<n; i++)
        {
            int ind= nums[i]%n;
            nums[ind]+= n;
        }

        // chhaant lo
        for(int i= 0; i<n; i++)
        {
            if(nums[i]/n >= 2)
                ans.add(i);
        }
        
        return ans;
    }
}
// @lc code=end

