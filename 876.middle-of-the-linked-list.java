/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) 
    {
        ListNode nor, dou;
        nor= dou= head;
        while(dou.next!=null || dou.next.next!=null)
        {
            nor= nor.next;
            dou= dou.next.next;
        }
        if(dou.next==null)
            return nor;
        return nor.next;
    }
}
// @lc code=end

