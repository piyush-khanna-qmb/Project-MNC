class frogJumpWithK
{
    // private static int doRecShit(int arr[], int k, int i, int dp[])
    // {
    //     if(i<=0)
    //         return 0;

    //     if(dp[i]!=-1)
    //         return dp[i];

    //     int minCost= Integer.MAX_VALUE;
    //     for(int t= 1; t<=k && i-t>=0; t++)
    //     {
    //         int cost= Math.abs(arr[i]-arr[i-t]) + doShit(arr, k, i-t, dp);
    //         minCost= Math.min(cost, minCost);
    //     }
    //     return dp[i]= minCost;
    // }

    private static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static int doShit(int arr[], int k)
    {
        int n= arr.length;
        int dp[]= new int[n];
        for(int i=1; i<=k; i++) {
            dp[i]= Integer.MAX_VALUE;
        }
        for(int i= 0; i<n-1; i++)
        {
            for(int j= i+1; j<n && j<=i+k; j++)
            {
                dp[j]= Math.min(dp[j], dp[0]+Math.abs(arr[j]-arr[i]));
            }
            // print(dp);
        }
        return dp[dp.length-1];
    }

    public static void main(String args[])
    {
        int arr[]= {10, 30, 40, 50, 20};
        int k= 3;
        System.out.println( doShit(arr, k));
    }
}