import java.util.*;
class mergeSort
{
    private static void mS(int arr[], int st, int end)
    {
        if(st < end)
        {
            int mid= (st+end)/2;
            mS(arr, st, mid);
            mS(arr, mid+1, end);
            merge(arr, st, mid, end);
        }
    }

    private static void merge(int arr[], int st, int mid, int end)
    {
        int tmp[]= new int[end-st+1];
        int i= st, j= mid+1, k= 0;

        while(i<=mid && j<=end)
        {
            if(arr[i] <= arr[j])
                tmp[k++]= arr[i++];
            else
                tmp[k++]= arr[j++];
        }
        while(i<=mid)
            tmp[k++]= arr[i++];
        while(j<=end)
            tmp[k++]= arr[j++];
        
        for(int t= 0; t<tmp.length; t++)
            arr[st+t]= tmp[t];
    }

    public static void main(String args[])
    {
        int a[]= {12,45,78,9,4,2,65,8,23,1,7,97,2};
        mS(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}