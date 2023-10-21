class Solution 
{
    public int maxProfit(int[] a, int fee) 
    {
        int prev[]= new int[2];
        int cur[]= new int[2];
        for(int i= a.length-1; i>=0; i--)
        {
            for(int buy= 0; buy<=1; buy++)
            {
                if(buy == 1)
                {
                    int yas= -a[i] + prev[0];
                    int nah= prev[1];
                    cur[buy]= Math.max(yas, nah);
                }
                else
                {
                    int yas= a[i] - fee + prev[1];
                    int nah= prev[0];
                    cur[buy]= Math.max(yas, nah);
                }
            }
            prev= cur;
        }

        return cur[1];
    }
}