/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head==null)
            return null;

        ListNode temp= new ListNode(0);
        temp.next= head;
        while(temp!=null)
        {
            if(temp.next!=null && temp.next.val==val)
                temp.next= temp.next.next;
            else
                temp= temp.next;
        }
        return head;
    }
}
// @lc code=end

