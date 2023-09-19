/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution 
{
    private void func(List<List<Integer>> ans, List<Integer> ds, int nums[], boolean vis[])
    {
        if(ds.size() == nums.length)
        {
            ans.add(new ArrayList(ds));
            return;
        }

        for(int i= 0; i<nums.length; i++)
        {
            if(vis[i] || (i>0 && nums[i]==nums[i-1] && !vis[i-1]))
                continue;
            
            vis[i]= true;
            ds.add(nums[i]);
            func(ans, ds, nums, vis);
            vis[i]= false;
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        List<Integer> ds = new ArrayList();
        boolean vis[]= new boolean[nums.length];
        Arrays.sort(nums);

        func(ans, ds, nums, vis);
        return ans;
    }
}
// @lc code=end