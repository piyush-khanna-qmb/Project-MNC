/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution 
{
    private void nikaaliyo(List<List<Integer>> ans, List<Integer> beech, int arr[], int tar, int i, int s) 
    {
        if(s==tar) {
            ans.add(beech);
        }
        if(s>tar) {   
            return;
        }
        
        //  Yahi
        s+= arr[i];
        beech.add(arr[i]);
        nikaaliyo(ans, beech, arr, tar, i, s);

        // Agla
        s-= arr[i];
        beech.remove(beech.size()-1);
        nikaaliyo(ans, beech, arr, tar, i, s);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ans= new ArrayList();
        nikaaliyo(ans, new ArrayList(), candidates, target, 0, 0);
        return ans;
    }
}
// @lc code=end

