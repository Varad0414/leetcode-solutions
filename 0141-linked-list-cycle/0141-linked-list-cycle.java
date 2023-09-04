/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ArrayList<Integer> al = new ArrayList<>();

        ListNode n = head;

        while(n != null){
            if(al.contains(n.val)){
                int cnt = 0;
                while(al.contains(n.val) && n != null){
                    cnt++;
                    n = n.next;
                    if(n == null)
                        return false;
                    if(cnt > 8)
                        return true;
                }
            }
            al.add(n.val);
            n = n.next;
        }

        return false;
    }
}