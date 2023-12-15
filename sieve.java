class Solution
{
    static ArrayList<Integer> sieveOfEratosthenes(int N)
    {
        int ans= new ArrayList();
        if(N <= 1)
            return ans;
        
        boolean vis[]= new int[N+1];
        for(int i= 2; i<=N; i++)
        {
            if(!vis[i])
            {
                ans.add(i);
                int k= i;
                while(k<=N) {
                    vis[k]= true;
                    k+= i;
                }
            }
        }
    }
}