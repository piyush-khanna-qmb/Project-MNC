/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution 
{
    public void func(List<List<Integer>> ans, List<Integer> ds, int i, int nums[], Set<List<Integer>> diary)
    {
        if(i==nums.length) {
            List<Integer> kuppi= new ArrayList(ds);
            if(!diary.contains(kuppi)) {
                ans.add(kuppi);
                diary.add(kuppi);
            }
            return;
        }
        
        func(ans, ds, i+1, nums, diary);

        ds.add(nums[i]);
        func(ans, ds, i+1, nums, diary);
        
        ds.remove(ds.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        Set<List<Integer>> diary= new HashSet();
        func(ans, new ArrayList(), 0, nums, diary);
        return ans;
    }
}
// @lc code=end

