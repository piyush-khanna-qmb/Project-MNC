public class ninTraining 
{
    private static int f(int n, int points[][], int last)
    {
        if(n == 0)
        {
            int maxi= 0;
            for(int i= 0; i<3; i++)
            {
                if(i != last)
                    maxi= Math.max(maxi, points[0][i]);
            }
            return maxi;
        }

        int maxi= 0;
        for(int i=0; i<3; i++)
        {
            if(i != last)
                maxi= Math.max(maxi, points[n][i]+f(n, points, i));
        }
        return maxi;
    }

    public static int ninjaTraining(int n, int points[][]) 
    {
        return f(n, points, 3);
    }
}