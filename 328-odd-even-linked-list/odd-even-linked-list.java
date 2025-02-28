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
    public ListNode oddEvenList(ListNode head) {

if(head == null || head.next == null){
    return head;
}

        ListNode even = null;
        ListNode odd = null;
        ListNode evenhead = null;
        ListNode oddhead = null;
        ListNode temp = head;
        int i = 1;
        while(temp != null){
            if(i % 2 == 0){
                if(evenhead == null){
                    evenhead= temp;
                    even = temp;

                }
                else{
                    even.next= temp;
                    even = even.next;

                }

            }
            else{
                if(oddhead == null){
                    oddhead = temp;
                    odd  =  temp;
                }
                else{
                    odd.next = temp;
                    odd = odd.next;


                }
            }

            temp = temp.next;
            i++;


        }

        odd.next = evenhead;
        even.next = null;
        return oddhead;
    }
}