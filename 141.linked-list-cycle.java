/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
            return false;
        ListNode norm, doub;
        norm= doub= head;
        while(doub!=null && doub.next!=null)
        {
            norm= norm.next;
            doub= doub.next.next;
            if(norm == doub)
                return true;
        }
        return false;
    }
}
// @lc code=end

