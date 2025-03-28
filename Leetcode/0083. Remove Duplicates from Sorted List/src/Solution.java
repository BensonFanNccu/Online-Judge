public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        /*
         * Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        ListNode cur = head;

        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return head;
    }
}
