/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution 
{
    public String addBinary(String a, String b) 
    {
        if(a.length() == 0)
            return b;
        else if(b.length() == 0)
            return a;
        
        int car= 0;
        int i= a.length()-1, j= b.length()-1;
        StringBuilder ans= new StringBuilder();
        while(i>=0 || j>=0 || car>0)
        {
            int sum= car;
            if(i>=0)
            {
                sum+= a.charAt(i) - '0';
                i--;
            }
            if(j>=0)
            {
                sum+= b.charAt(j) - '0';
                j--;
            }
            ans.insert(0, ""+ (sum%2));
            car= sum/2;
        }
        return ans.toString();
    }
}
// @lc code=end

