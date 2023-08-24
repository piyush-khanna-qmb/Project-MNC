/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode dummy= new ListNode(0);
        ListNode head= dummy;
        int n= lists.length;
        ListNode kk= Lists[0];
        for(int i=1; i<n; i++)
        {
            if(lists[i].val < kk.val)
                kk= lists[i];
        }
        head.next= kk;
        k= kk.next;
        boolean bb;
        while(true)
        {
            bb= false;
            ListNode sm= lists[0];
            for(int i= 1; i<lists.length; i++)
            {
                if(lists[i]!=null && sm.val > lists[i].val)
                {
                    bb= true;
                    sm= lists;
                }
            }
            if(bb == false)
                break;
            head.next= sm;
            sm= sm.next;
        }
        return dummy.next;
    }
}
// @lc code=end

