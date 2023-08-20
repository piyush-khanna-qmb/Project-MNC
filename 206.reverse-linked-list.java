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
        ListNode prev, temp, next;
        prev= temp= null;
        next= head;
        while(next!=null)
        {
            temp= next;
            next= temp.next;
            temp.next= prev;
            prev= temp;
        }
        return temp;
    }
}
// @lc code=end

