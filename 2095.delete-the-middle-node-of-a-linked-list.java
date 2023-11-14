/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null || head.next == null)
            return null;

        ListNode slow, fast, prev;
        slow= fast= prev= head;
        while(fast!=null && fast.next!=null)
        {
            prev= slow;
            slow= slow.next;
            fast= fast.next.next;;
        }
        prev.next= slow.next;
        return head;
    }
}
// @lc code=end