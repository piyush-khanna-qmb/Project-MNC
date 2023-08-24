/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head==null)
            return null;

        ListNode norm, doub;
        norm= doub= head;

        while(doub!=null && doub.next!=null)
        {
            norm= norm.next;
            doub= doub.next.next;
            if(norm==doub)
            {
                norm= head;
                while(norm!=doub)
                {
                    norm= norm.next;
                    doub= doub.next;
                }
                return norm;
            }
        }
        return null;
    }
}
// @lc code=end

