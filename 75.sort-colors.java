/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution
{
    public void sortColors(int[] arr)
    {
        int mid= 0, low= 0, high= arr.length-1;

        while(mid <= high)
        {
            if(arr[mid] == 0) {
                swapIt(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                swapIt(arr, mid, high);
                high--;
            }
        }
    }
    private void swapIt(int arr[], int i, int j)
    {
        int tmp= arr[i];
        arr[i]= arr[j];
        arr[j]= tmp;
    }
}
// @lc code=end

