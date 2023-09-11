/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution 
{
    private void func(List<List<Integer>> ans, List<Integer> beech, int arr[], int i, int tar)
    {
        if(tar == 0) {
            ans.add(new ArrayList(beech));
            return;
        }
        if(i>=arr.length || arr[i]>tar) {
            return;
        }
        for(int ind= i; ind<arr.length; ind++) 
        {
            if(ind>i && arr[ind]==arr[ind-1]) {
                continue;
            }
            beech.add(arr[ind]);
            func(ans, beech, arr, ind+1, tar-arr[ind]);
            
            beech.remove(beech.size()-1);
        }
    }   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList();
        func(ans, new ArrayList(), candidates, 0, target);
        return ans;
    }
}
// @lc code=end

