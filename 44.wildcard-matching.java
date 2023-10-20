class Solution {
    private boolean f(int i, int j, char[] s, char[] t, Boolean[][] dp) 
    {
        if (j == 0 && i==0)
            return true;
        else if(j == 0)
            return false;
        else if (i == 0){
            for(int k= 0; k<j; k++)
                if(t[k] != '*')
                    return false;
            return true;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (s[i - 1] == t[j - 1] || t[j - 1] == '?') {
            dp[i][j] = f(i - 1, j - 1, s, t, dp);
        } 
        else if (t[j - 1] == '*') 
        {
            boolean yahi = f(i - 1, j, s, t, dp);
            boolean agla = f(i, j - 1, s, t, dp);
            dp[i][j] = yahi || agla;
        } 
        else {
            dp[i][j] = false;
        }

        return dp[i][j];
    }

    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        Boolean[][] dp = new Boolean[m + 1][n + 1];
        return f(m, n, s.toCharArray(), p.toCharArray(), dp);
    }
}