/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {
            // If there's no child, move to the next node
            if (current.child == null) {
                current = current.next;
            } else {
               
                Node nextNode = current.next;
                Node childList = flatten(current.child);

                
                current.next = childList;
                childList.prev = current;
                current.child = null; 

              
                Node tail = childList;
                while (tail.next != null) {
                    tail = tail.next;
                }

        
                if (nextNode != null) {
                    tail.next = nextNode;
                    nextNode.prev = tail;
                }

                current = nextNode;
            }
        }

        return head;
    }
}
