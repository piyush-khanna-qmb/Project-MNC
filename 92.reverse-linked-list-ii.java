/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(head == null || head.next == null)
            return head;

        ListNode top= new ListNode(-1);
        top.next= head;
        ListNode nxt;
        while(nxt != null)
        {
            nxt= 
            if(nxt.val == left)
            {
                ListNode curr, prev;
                curr= prev= null;

            }
        }
    }
}
// @lc code=end

