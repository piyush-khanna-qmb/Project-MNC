import java.util.*;
class quickSort 
{        
    private static void qS(int arr[], int st, int end)
    {
        if(st < end)
        {
            int p= pivot(arr, st, end);
            qS(arr, st, p-1);
            qS(arr, p+1, end);
        }
    }

    private static int pivot(int arr[], int st, int end)
    {
        int p= arr[st], i= st, j= end;
        while(i<j)
        {
            while(i<end && arr[i]<=p)
                i++;
            while(j>st && arr[j]>p)
                j--;
            
            if(i<j) {
                int tmp= arr[i];
                arr[i]= arr[j];
                arr[j]= tmp;
            }
        }
        int tmp= arr[st];
        arr[st]= arr[j];
        arr[j]= tmp;

        return j;
    }

    public static void main(String args[]) 
    {
        int a[]= {12,65,3,7,98,1,65,8,3,2};
        qS(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}