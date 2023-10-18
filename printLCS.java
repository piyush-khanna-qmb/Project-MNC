import java.util.*;
public class printLCS 
{
	public static StringBuilder lcs(String s, String t) 
    {
        char ss[]= s.toCharArray();
        char tt[]= t.toCharArray();

        int m= ss.length, n= tt.length;
        int dp[][]= new int[m+1][n+1];

        for(int i= 0; i<=m; i++)
        {
            for(int j= 0; j<=n; j++)
            {
                if(i==0 || j==0)
                    dp[i][j]= 0;
                else if(ss[i-1] == tt[j-1])
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]); 
            }
        }
        int i= m, j= n;
        StringBuilder sb= new StringBuilder();
        while(i>0 && j>0)
        {
            if(ss[i-1] == tt[j-1])
            {
                sb.append(ss[i-1]);
                i--;
                j--;
            }
            else
            {
                if(dp[i-1][j] >= dp[i][j-1])
                    i--;
                else
                    j--;
            }
        }
        return sb.reverse();
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        System.out.println(lcs(s,t));
    }
}