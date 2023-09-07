/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {

    private void nikaaliyo(List<List<Integer>> ans, List<Integer> beech, int arr[], int tar, int i, int s) {

        if(i == arr.length) {
            if(s==tar) {
                ans.add(beech);
            }
        }
        
        s+= arr[i];
        beech.add(arr[i]);
        nikaaliyo(ans, beech, arr, tar, i+1, s);

        s-= arr[i];
        beech.remove(Integer.valueOf(arr[i]));
        nikaaliyo(ans, beech, arr, tar, i+1, s);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList();
        return nikaaliyo(ans, new ArrayList(), candidates, target, 0, 0);
    }
}
// @lc code=end

