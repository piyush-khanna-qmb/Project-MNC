/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution 
{
    private void sexyFunc(List<List<Integer>> ans, List<Integer> ds, int i, int nums[])
    {
        if(i==nums.length) 
        {
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(nums[i]);
        sexyFunc(ans, ds, i+1, nums);
        ds.remove(ds.size()-1);
        sexyFunc(ans, ds, i+1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        sexyFunc(ans, new ArrayList(), 0, nums);
        return ans;
    }
}
// @lc code=end

