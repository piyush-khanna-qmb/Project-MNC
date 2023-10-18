/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start
class Solution 
{
    private int f(int i, int j, char t1[], char t2[], int dp[][])
    {
        if(i == 0 || j == 0) {
            return 0;
        }
        if(dp[i][j] != -1)
            return dp[i][j];
        if(t1[i-1] == t2[j-1]) {
            return dp[i][j]= 1 + f(i-1, j-1, t1, t2, dp);
        }
        else {
            int oopar= f(i-1, j, t1, t2, dp);
            int side= f(i, j-1, t1, t2, dp);
            return dp[i][j]= Math.max(oopar, side);
        }
    }
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m= text1.length();
        int n= text2.length();
        int dp[][]= new int[m+1][n+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        
        return f(m, n, text1.toCharArray(), text2.toCharArray(), dp);
    }
}
// @lc code=end