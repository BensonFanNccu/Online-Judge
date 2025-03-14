public class Solution {
    public ListNode removeElements(ListNode head, int val){
        /*
         * Straight Forward
         * Time: O(N)
         * Space: O(1)
         */
        
        if(head == null) return null;

        ListNode cur = head;

        while(cur != null && cur.next != null){
            if(cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }

        if(head.val == val) return head.next;
        else return head;
    }
}
