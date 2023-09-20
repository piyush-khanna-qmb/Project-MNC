/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution 
{
    private void func(List<List<Integer>> ans, List<Integer> ds, int arr[], int i, int tar)
    {
        if(tar == 0) 
        {
            ans.add(new ArrayList(ds));
            return;
        }
        if(i>=arr.length || arr[i]>tar)
            return;
        
        for(int j= i; j<arr.length; j++)
        {
            if(i!=j && arr[j]==arr[j-1])
                continue;
            
            ds.add(arr[j]);
            func(ans, ds, arr, j+1, tar-arr[j]);

            ds.remove(ds.size()-1);
        }
    }   
    public List<List<Integer>> combinationSum2(int[] arr, int tar) 
    {
        Arrays.sort(arr);
        List<List<Integer>> ans= new ArrayList();
        func(ans, new ArrayList(), arr, 0, tar);
        return ans;
    }
}
// @lc code=end

