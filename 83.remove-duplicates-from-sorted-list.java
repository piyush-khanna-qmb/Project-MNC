/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    private ListNode nextGay(ListNode st)
    {
        if(st==null || st.next==null)
            return null;
        
        ListNode temp= st;
        while(temp.val == st.val)
            temp= temp.next;

        return temp;
    }
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null || head.next==null)
            return head;
        
        ListNode temp= head;
        while(temp!=null)
        {
            temp.next= nextGay(temp);
            temp= temp.next;
        }
        return head;
    }
}
// @lc code=end

