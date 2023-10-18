import java.util.*;
public class Solution
{
    public static int lcs(String str1, String str2)
    {
        int n= str1.length(), m= str2.length(), ans= 0;
        int prev[]= new int[m+1];
        int cur[]= new int[m+1];
        for(int i= 1; i<=n; i++)
        {
            for(int j= 1; j<=m; j++)
            {
                if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    cur[j]= 1 + prev[j-1];
                    ans= Math.max(ans, cur[j]);
                }
                else
                    cur[j]= 0; 
            }
            prev= Arrays.copyOf(cur, cur.length);
        }
        return ans;
    }
}