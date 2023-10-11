import java.util.*;
import java.io.*;

public class countSubsetsWithSum
{
    private static int f(int arr[], int tar, int i)
    {
        if(tar == 0)
            return 1;
        if(i<0)
            return 0;
        
        int take= f(arr, tar-arr[i], i-1);
        int notTake= f(arr, tar, i-1);

        return take+notTake;
    }
    public static int findWays(int num[], int tar) 
    {
        return f(num, tar, 0);
    }
}