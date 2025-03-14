public class Solution {
    public boolean hasCycle(ListNode head){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */

        if(head == null) return false;

        ListNode fast = head.next, slow = head;

        while(slow != fast){
            if(fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
