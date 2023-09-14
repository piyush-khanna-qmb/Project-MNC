/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution 
{
    private void swap(int arr[], int i, int j)
    {
        int tmp= arr[i];
        arr[i]= arr[j];
        arr[j]= tmp;
    }
    private void ting(List<List<Integer>> ans, int arr[], int i)
    {
        if(i>=arr.length-1) {
            List<Integer> hui= new ArrayList();
            for(int n: arr) 
                hui.add(n);
            ans.add(hui);
            return;
        }
        for(int k= i; k<arr.length; k++) {
            swap(arr, i, k);
            ting(ans, arr, i+1);
            swap(arr, i, k);
        }
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        ting(ans, nums, 0);
        return ans;
    }
}
// @lc code=end

