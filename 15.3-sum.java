/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
// Maadharchod. Ek number ka maadharchod question hai jo mere 4 din kha gaya bhainkalnd. Suar 🐖
class Solution 
{
    public List<List<Integer>> threeSum(int[] a)
    {
        List<List<Integer>> out= new ArrayList<>();
        if(a.length < 3)
            return out;
        
        int n= a.length;
        Arrays.sort(a);
        int l, r, tar;
        for(int i=0; i<n-2; i++)
        {
            if(a[i]>0)
                break;
            if (i > 0 && a[i] == a[i - 1])
                continue; 
            l= i+1;
            r= n-1;
            tar= -a[i];
            while(l<r)
            {
                if(a[l]+a[r] > tar)
                    r--;
                else if(a[l]+a[r] < tar)
                    l++;
                else
                {
                    out.add(Arrays.asList(a[i], a[l], a[r]));
                    while(l<n-1 && a[l]==a[l+1])
                        l++;
                    while(r>l && a[r]==a[r-1])
                        r--;
                    l++;
                    r--;
                }
            }
        }
        return out;
    }
}
// @lc code=end

