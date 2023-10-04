/*
 * @lc app=leetcode id=698 lang=java
 *
 * [698] Partition to K Equal Sum Subsets
 */

// @lc code=start
class Solution 
{
    private void hui(List<List<Integer>> ans, List<Integer> ds, int tar, int ind, int cnt[], int arr[])
    {
        if(tar == 0)
        {
            cnt[0]+= 1;
            ans.add(new ArrayList(ds));
            return;
        }
        if(ind>=arr.length || arr[ind]>tar)
            return;
        
        for(int i= ind; i<arr.length; i++)
        {
            if(i!=ind && arr[i]==arr[i-1])
                continue;
            ds.add(arr[i]);
            hui(ans, ds, tar-arr[i], i+1, cnt, arr);
            ds.remove(ds.size()-1);
        }
    }
    public boolean canPartitionKSubsets(int[] nums, int k) 
    {
        List<List<Integer>> ans= new ArrayList();
        Arrays.sort(nums);
        int cnt[]= {0};
        int tar= Arrays.stream(nums).sum()/k;
        hui(ans, new ArrayList(), tar, 0, cnt, nums);
        return cnt[0]==k;
    }
}
// @lc code=end

