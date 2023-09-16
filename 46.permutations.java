class Solution 
{
    private void ting(List<List<Integer>> ans, List<Integer> ds, int arr[], boolean vis[])
    {
        if(ds.size()==arr.length)
        {
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(!vis[i])
            {
                vis[i]= true;
                ds.add(arr[i]);
                ting(ans, ds, arr, vis);
                vis[i]= false;
                ds.remove(Integer.valueOf(arr[i]));
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        List<Integer> ds= new ArrayList();
        boolean vis[]= new boolean[nums.length];
        ting(ans, ds, nums, vis);
        return ans;
    }
}
// @lc code=end

