public class Solution {
    public ListNode detectCycle(ListNode head){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * SPace: O(1)
         */

        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        if(fast == null || fast.next == null) return null;

        while(head != fast){
            head = head.next;
            fast = fast.next;
        }

        return head;
    }
}
