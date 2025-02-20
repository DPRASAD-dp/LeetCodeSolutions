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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null  && n ==1){
            return null;
        }
        

        int count  = 0;
        ListNode temp = head;
        while(temp !=  null){
            count++;
            temp = temp.next;
        }
        if(n == count){
            return head.next;
        }

        int l = count - n +1 ;
        
        ListNode node  = head;

        for(int i =1;i<l-1;i++){
            node = node.next;
        }
        if(node != null && node.next!= null){
            node.next = node.next.next;
        }
        

        return head;
    }
}