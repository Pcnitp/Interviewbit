/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode a) {
        ListNode first = a;
        
        while(true) {
            if(first == null) break;
            ListNode second=first.next;
            if(second == null) break;
            
            int x = first.val;
            first.val = second.val;
            second.val = x;
            
            first = second.next;
        }
        
        return a;
    }
}
