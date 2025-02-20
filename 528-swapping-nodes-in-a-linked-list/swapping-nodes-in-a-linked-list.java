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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int l = count - k + 1 ;
        ListNode a = head;
        ListNode b = head;

        for (int i =1 ; i< l  ; i++){
            b = b.next;
        }
        for (int j =1 ; j< k; j++){
            a = a.next;
        }

        int temp2 = a.val;

        a.val = b.val;
        b.val = temp2;


        return head;

        




    }
}