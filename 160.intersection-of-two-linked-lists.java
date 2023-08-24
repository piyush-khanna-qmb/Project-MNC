/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA==null || headB==null)
            return null;

        int l1= 0, l2= 0;
        ListNode temp= headA;
        while(temp!=null)
        {
            l1++;
            temp= temp.next;
        }
        temp= headB;
        while(temp!=null)
        {
            l2++;
            temp= temp.next;
        }

        while(l1>l2)
        {
            headA= headA.next;
            l1--;
        }
        while(l2>l1)
        {
            headB= headB.next;
            l2--;
        }

        while(l1>0)
        {
            if(headA.next == headB.next)
                return headA.next;
            headA= headA.next;
            headB= headB.next;
        }
        return null;
    }
}
// @lc code=end

