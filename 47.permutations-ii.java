/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
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

    private void duggal(List<List<Integer>> ans, int arr[], int i)
    {
        if(i==arr.length)
        {
            List<Integer> billu= new ArrayList();
            for(int ekVariableKaChhotaSaNaamTaakiUseBulaSakuHuiHuiHui: arr)
                billu.add(ekVariableKaChhotaSaNaamTaakiUseBulaSakuHuiHuiHui);
            ans.add(billu);
            return;
        }
        for(int k=i; k<arr.length; k++)
        {
            if(i!=k && arr[i]==arr[k])
                continue;
            swap(arr, i, k);
            duggal(ans, arr, i+1);
            swap(arr, i, k);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        duggal(ans, nums, 0);
        return ans;
    }
}
// @lc code=end

