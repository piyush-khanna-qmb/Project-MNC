/*
 * @lc app=leetcode id=1312 lang=java
 *
 * [1312] Minimum Insertion Steps to Make a String Palindrome
 */

// @lc code=start
class Solution 
{
    private int f(String s, String t)
    {
        int m= s.length(), n= t.length();
        int prev[]= new int[n+1];
        int cur[]= new int[n+1];

        for(int i= 1; i<=m; i++)
        {
            for(int j= 1; j<=n; j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                    cur[j]= 1 + prev[j-1];
                else
                    cur[j]= Math.max(prev[j] , cur[j-1]);
            }
            prev= Arrays.copyOf(cur, n+1);
        }

        return cur[n];
    }

    public int minInsertions(String s) 
    {
        int lcs= f(s, new StringBuilder(s).reverse().toString());
        return s.length()-lcs;
    }
}
// @lc code=end

