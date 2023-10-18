import java.util.*;
public class longestCommonSubstring
{
    public static int lcs(String str1, String str2)
    {
        int m= str1.length(), n= str2.length(), max= Integer.MIN_VALUE;
        int dp[][]= new int[m+1][n+1];
        for(int i= 0; i<=m; i++)
        {
            for(int j= 0; j<=n; j++)
            {
                if(i==0 || j==0)
                    dp[i][j]= 0;
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    dp[i][j]= 1 + dp[i-1][j-1];
                    max= Math.max(max, dp[i][j]);
                }
                else
                    dp[i][j]= 0; 
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(lcs(s, t));
    }
}


