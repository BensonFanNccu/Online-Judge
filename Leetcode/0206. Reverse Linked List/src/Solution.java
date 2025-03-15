public class Solution {
    public ListNode reverseList(ListNode head){
        /*
         * Iterative Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        ListNode cur = head, prev = null, next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
