class Solution 
{
    public int maxProfit(int[] a) 
    {
        int grPro= 0, n= a.length, m= Integer.MAX_VALUE, pro= 0;
        for(int i=0; i<n; i++)
        {
            if(a[i] < m)
                m= a[i];
            pro= a[i]-m;
            if(grPro < pro)
                grPro= pro;
        }
        return grPro;
    }
}