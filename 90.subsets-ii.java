/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution 
{
    public void func(List<List<Integer>> ans, List<Integer> ds, int i, int nums[])
    {
        ans.add(new ArrayList(ds));

        for(int ind= i; ind<nums.length; ind++)
        {
            if(i!=ind && nums[ind]==nums[ind-1])
                continue;
            
            ds.add(nums[ind]);
            func(ans, ds, ind+1, nums);

            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        Arrays.sort(nums);
        func(ans, new ArrayList(), 0, nums);
        return ans;
    }
}
// @lc code=end

