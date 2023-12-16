/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode prev, next, curr;
        prev= curr= null;
        next= head;
        while(next != null)
        {
            curr= next;
            next= curr.next;
            curr.next= prev;
            prev= curr;
        }
        return curr;
    }
}
// @lc code=end