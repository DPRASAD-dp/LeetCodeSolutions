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
    public ListNode rotateRight(ListNode head, int k) {
        

        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            n++;
            temp = temp.next;

        }
        int a = k%n;
        if(a == 0){
            return head;
        }
        
        temp.next = head;
        ListNode temp2 = head;
        int i = n-a;

        for(int j =0;j<i-1;j++){
            temp2 = temp2.next;
            
        }
        ListNode newhead  = temp2.next;
        temp2.next = null;
        return newhead;
        
    }
    
}