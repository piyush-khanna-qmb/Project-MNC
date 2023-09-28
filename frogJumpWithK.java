class frogJumpWithK
{
    private static int doShit(int arr[], int k, int i)
    {
        if(i<=0)
            return 0;

        int minCost= Integer.MAX_VALUE;
        for(int t= 1; t<=k && i-t>=0; t++)
        {
            int cost= Math.abs(arr[i]-arr[i-t]) + doShit(arr, k, i-t);
            minCost= Math.min(cost, minCost);
        }
        return minCost;
    }

    public static void main(String args[])
    {
        int arr[]= {40, 10, 20, 70, 80, 10, 20, 70, 80, 60};
        int k= 4;
        System.out.println( doShit(arr, k, arr.length-1) );
    }
}