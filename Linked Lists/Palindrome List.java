/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode a) {
        ListNode b = a;
        int n=0;
        while(b != null) {
            n++;
            b = b.next;
        }
        
        int mid = n/2;
        ListNode c = a;
        ListNode prev = null;
        
        while(mid>0) {
            mid--;
            ListNode d = c.next;
            c.next = prev;
            prev = c;
            c = d;
        }
        
        if(n%2 == 1) c = c.next;
        
        while(c!= null) {
            if(c.val != prev.val) return 0;
            c = c.next;
            prev = prev.next;
        }
        
        return 1;
    }
}
