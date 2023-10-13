import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static int f(int i, int tar, int arr[], int dp[][])
    {
        int mod= (int)Math.pow(10, 9) + 7;
        
		if(i == 0)
		{
			if(tar == 0 && arr[0]==0)
				return 2;
			if(tar == 0 || tar == arr[0])
				return 1;
			return 0;
		}

		if(dp[i][tar]!=-1)
			return dp[i][tar];
        
        int take= (tar>=arr[i]) ? f(i-1, tar-arr[i], arr, dp)%mod : 0;
        int notTake= f(i-1, tar, arr, dp)%mod;
        return dp[i][tar]= (take+notTake)%mod;
    }

	public static int countPartitions(int n, int d, int[] arr) 
    {
        int sum = Arrays.stream(arr).sum();
        int tar = (sum - d) / 2;
        if ( tar<0 || (sum - d) % 2 != 0)
            return 0;

        int dp[][] = new int[n][tar + 1];
        for (int k[] : dp)
            Arrays.fill(k, -1);

        return f(n - 1, tar, arr, dp);
	}
}