/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution 
{
    private void subsexy(int nums[], List<List<Integer>> ans, List<Integer> k, int i)
    {
        if(i==nums.length)
            ans.add(k);

        k.add(nums[i]);
        subsexy(nums, ans, k, i+1);
        k.remove(Integer.valueOf(nums[i]));
        subsexy(nums, ans, k, i+1);
    }
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        subsexy(nums, ans, new ArrayList(), 0);
        return ans;
    }
}
// @lc code=end

