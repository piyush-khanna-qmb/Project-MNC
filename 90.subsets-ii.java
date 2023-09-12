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
        if(i==nums.length) {
            List<Integer> kuppi= new ArrayList(ds);
            if(!ans.contains(kuppi)) {
                ans.add(kuppi);
            }
            return;
        }
        
        func(ans, ds, i+1, nums);

        ds.add(nums[i]);
        func(ans, ds, i+1, nums);
        
        ds.remove(ds.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        func(ans, new ArrayList(), 0, nums);
        return ans;
    }
}
// @lc code=end

