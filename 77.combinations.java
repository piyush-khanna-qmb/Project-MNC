/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution 
{
    private void ting(List<List<Integer>> ans, List<Integer> ds, int n, int k, int i)
    {
        if(ds.size() == k)
        {
            ans.add(new ArrayList(ds));
            return;
        }
        for(int j=i; j<=n; j++)
        {
            ds.add(j);
            ting(ans, ds, n, k, j+1);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) 
    {        
        List<List<Integer>> ans= new ArrayList();
        ting(ans, new ArrayList(), n, k, 1);
        return ans;
    }
}
// @lc code=end

