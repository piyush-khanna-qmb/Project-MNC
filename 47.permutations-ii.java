/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution 
{
    private void func(List<List<Integer>> ans, List<Integer> ds, int arr[], boolean vis[])
    {
        if(ds.size() == arr.length)
        {
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(vis[i] || (i>0 && arr[i]==arr[i-1] && !vis[i-1]))
                /*
                i>0 sirf isliye hai kyuki arr[i-1] krne me underflow na ho jaye, although main motive hai ki koi value last value ke baraabar na ho tatha usse pichhle wala visited na ho to vo case usi recursion ka hissa hoga jo redundant hogi, isliye use chhodh do.

                In input example: [1,1,1,2]
                Ye || ke baad waala saara jhamela isliye likha gaya hai taaki [❌,✅,❌,❌] wali condition na ban paaye. Bole to aisi value jo mujhe pta hai ki pehle hi tackle kar li gyi hogi kyuki usse pehle same hi value aati hai uske lena hi nhi hai, check bhi nhi krna ki usse kuchh naya permute ban skta hai ki nhi, kyuki ban hi nahi sakta.
                */
                continue;
            
            vis[i]= true;
            ds.add(arr[i]);
            func(ans, ds, arr, vis);
            vis[i]= false;
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        List<Integer> ds = new ArrayList();
        boolean vis[]= new boolean[nums.length];
        Arrays.sort(nums);
        func(ans, ds, nums, vis);
        return ans;
    }
}
// @lc code=end