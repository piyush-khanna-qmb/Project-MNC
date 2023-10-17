/*
Collect rod pieces to make the entire rod length
In doing so, collect the rod pieces that are most expensive.
*/

import java.util.*;
public class Solution
{
	static int f(int i, int tar, int price[], int dp[][])
	{
		if(i < 0)
			return 0;
		if(dp[i][tar] != -1)
			return dp[i][tar];
		int take= (tar>=i+1) ? price[i]+f(i, tar-(i+1), price, dp) : 0;
		int noTake= f(i-1, tar, price, dp);
		
		return dp[i][tar]= Math.max(take, noTake);
	}
	public static int cutRod(int price[], int n) 
    {
		int dp[][]= new int[n+1][n+1];
		for(int r[]: dp)
			Arrays.fill(r, -1);
		return f(n, n, price, dp);
	}
}