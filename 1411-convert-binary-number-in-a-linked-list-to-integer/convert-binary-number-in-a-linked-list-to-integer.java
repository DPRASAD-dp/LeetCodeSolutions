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
class Solution {
    public int getDecimalValue(ListNode head) {

        if(head  == null  || head.next  == null){
            return head.val;
        }
        int result = 0;
        ListNode temp = head;
       while (temp != null) {
            result = result * 2 + temp.val; 
            temp = temp.next;
        }
        
        return result;


        
    }
}