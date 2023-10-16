import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static int f(int i, int tar, int arr[], int dp[][])
    {
        if(i == 0)
        {
            if(arr[0] == 0 && tar == 0)
                return 2;
            else if(arr[0] == tar || tar == 0)
                return 1;
            return 0;
        }
        if(tar<0)
            return 0;
        if(dp[i][tar] != -1)
            return dp[i][tar];

        int mod= (int) Math.pow(10,9)+7;
        int take= f(i-1, tar-arr[i], arr, dp)%mod;
        int noTake= f(i-1, tar, arr, dp)%mod;
        return dp[i][tar]= (take+noTake)%mod;
    }

	public static int countPartitions(int n, int d, int[] arr) 
    {
        int tot= 0;
        for(int ele: arr)
            tot+= ele;
        
        if(d>tot || (tot-d)%2 != 0)
            return 0;
        int tar= (tot-d)/2;
        int dp[][]= new int[n][tar+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(n-1, tar, arr, dp);
	}
}