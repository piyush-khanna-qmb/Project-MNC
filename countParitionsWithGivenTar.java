import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static int f(int i, int tar, int arr[])
    {
        int mod= Math.pow(10, 9) + 7;
        if(tar == 0)
            return 1;
        if(i<0)
            return 0;
        
        int take= f(i-1, tar-arr[i], arr)%mod;
        int notTake= f(i-1, tar, arr)%mod;
        return (take+notTake)%mod;
    }

	public static int countPartitions(int n, int d, int[] arr) 
    {
        int dp[][]= new int[n][tar+1];
        for(int k[]: dp)
            Arrays.fill(k, -1);
        
        int sum= Arrays.stream(arr).sum();
        int tar= (sum-d>0 && (sum-d)%2 == 0) ? (sum-d)/2 : 0;
        return f(n-1, tar, arr);
	}
}