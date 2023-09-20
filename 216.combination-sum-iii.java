/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution 
{
    private void func(List<List<Integer>> ans, List<Integer> ds, int arr[], int size, int tar, int i)
    {
        if(ds.size() == size)
        {
            if(tar == 0) {
                ans.add(new ArrayList(ds));
            }
            return;
        }

        if(i>=arr.length || arr[i] > tar)
            return;
        
        for(int j= i; j<arr.length; j++)
        {
            if(j!=i && arr[j]==arr[j-1])
                continue;
            
            ds.add(arr[j]);
            func(ans, ds, arr, size, tar-arr[j], j+1);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        int arr[]= new int[9];
        for(int i= 0; i<9; i++)
            arr[i]= i+1;

        List<List<Integer>> ans= new ArrayList();
        func(ans, new ArrayList(), arr, k, n, 0);
        return ans;    
    }
}
// @lc code=end

