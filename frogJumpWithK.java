class frogJumpWithK
{
    private static int doShit(int arr[], int k, int n, int i)
    {
        if(i<=0)
            return 0;

        int minCost= Integer.MAX_VALUE;
        for(int t= 1; i<=k; t++)
        {
            int cost= Math.abs(arr[i]-arr[t]) + doShit(arr, k, n, i-t);
            minCost= Math.min(cost, minCost);
        }
        return minCost;
    }

    public static void main(String args[])
    {
        int arr[]= {40, 10, 20, 70, 80, 10, 20, 70, 80, 60};
        int k= 4;
        System.out.println( doShit(arr, k, arr.length, arr.length-1) );
    }
}