import java.util.*;
class quickSort {

    private static int partition(int arr[], int low, int high) {
        int pivot= arr[low];
        int i= low, j= high, tmp;
        while(i<j) {
            while(arr[i]<=pivot && i<high) 
                i++;
            while(arr[j]>pivot && j>low)
                j--;
            if(i<j) {
                tmp= arr[i];
                arr[i]= arr[j];
                arr[j]= tmp;
            }
        }
        tmp= arr[low];
        arr[low]= arr[j];
        arr[j]= tmp;
        return j;
    }

    private static void qS(int arr[], int low, int high) {
        if(low>high)
            return;
        int part= partition(arr, low, high);
        qS(arr, low, part-1);
        qS(arr, part+1, high);
    }

    public static void main(String args[]) {
        int a[]= {12,46,897,2,43,87,2,1,546,9,04,5};
        qS(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}