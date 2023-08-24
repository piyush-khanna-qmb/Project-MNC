/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
    private ListNode aageKaBhej(ListNode st, int k)
    {
        ListNode temp= st;
        while(temp!=null && k-->0)
            temp= temp.next;
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode dummy= new ListNode(-1, head);
        ListNode Mai= dummy;
        while(true)
        {
            ListNode Chela= aageKaBhej(Mai, k);
            if(Chela==null)
                break;
            ListNode IskaPehla= Mai.next;
            ListNode BaadKaPehla= Chela.next;

            ListNode yeWala, aglaLaunda, pichhlaLaunda;
            pichhlaLaunda= yeWala= null;
            aglaLaunda= Mai;
            do {
                yeWala= aglaLaunda;
                aglaLaunda= yeWala.next;
                yeWala.next= pichhlaLaunda;
                pichhlaLaunda= yeWala;
            } while(yeWala!=Chela);
            Mai.next= Chela;
            IskaPehla.next= BaadKaPehla;
            Mai= IskaPehla;
        }
        return dummy.next;
    }
}
// @lc code=end

