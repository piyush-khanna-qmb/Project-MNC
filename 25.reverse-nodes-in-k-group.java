/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    private int[] revArr(int arr[], int st, int end)
    {
        while(st<=end)
        {
            int temp= arr[st];
            arr[st++]= arr[end];
            arr[end--]= temp;
        }
        return arr;
    }

    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head.next == null)
            return head;

        // Finding length of arr
        int n= 0;
        ListNode temp= head;
        while(temp!=null)
        {
            n++;
            temp= temp.next;
        }

        //Copying to array
        int arr[]= new int[n];
        temp= head;
        int i= 0;
        while(temp!=null)
        {
            arr[i++]= temp.val;
            temp= temp.next;
        }

        //Reversing array acc. to conds.
        int last= 0;
        for(i= 0; i<n; i++)
        {
            if(i-last == k-1)
            {
                revArr(arr, last, i);
                if(i!= n-1)
                    last= i+1;
            }
        }

        // Mapping
        ListNode newHead= new ListNode(arr[0]);
        ListNode newTemp= newHead;
        for(i= 1; i<n; i++)
        {
            newTemp.next= new ListNode(arr[i]);
            newTemp= newTemp.next;
        }

        return newHead;
    }
}
// @lc code=end

