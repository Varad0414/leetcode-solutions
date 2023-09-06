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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        int len = 0;
        ListNode temp = head;
        
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        int quotient = len / k; 
        int remainder = len % k; 

        temp = head;

        for (int i = 0; i < k; i++) {
            arr[i] = temp;
            int partSize = quotient + (i < remainder ? 1 : 0); 

            for (int j = 0; j < partSize - 1; j++) {
                if (temp != null) {
                    temp = temp.next; 
                }
            }

            if (temp != null) {
                ListNode temp1 = temp;
                temp = temp.next;
                temp1.next = null; 
            }
        }

        return arr;
    }

}