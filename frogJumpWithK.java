class frogJumpWithK
{
    private static int doShit(int arr[], int k, int i, int dp[])
    {
        if(i<=0)
            return 0;

        if(dp[i]!=-1)
            return dp[i];

        int minCost= Integer.MAX_VALUE;
        for(int t= 1; t<=k && i-t>=0; t++)
        {
            int cost= Math.abs(arr[i]-arr[i-t]) + doShit(arr, k, i-t, dp);
            minCost= Math.min(cost, minCost);
        }
        return dp[i]= minCost;
    }

    public static void main(String args[])
    {
        int arr[]= {40, 10, 20, 70, 80, 10, 20, 70, 80, 60};
        int k= 4;
        int dp[]= new int[arr.length];

        for(int i=0; i<dp.length; i++) {
            dp[i]= -1;
        }
        System.out.println( doShit(arr, k, arr.length-1, dp));
    }
}