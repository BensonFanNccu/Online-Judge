public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */

        ListNode vHead = new ListNode(0), fast, slow;

        vHead.next = head;
        fast = vHead;
        slow = vHead;

        while(n >= 0){
            fast = fast.next;
            n--;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return vHead.next;
    }


    public ListNode removeNthFromEnd2(ListNode head, int n){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        ListNode vHead = new ListNode(0), cur;
        int size = 0;

        vHead.next = head;
        cur = vHead;

        while(cur.next != null){
            size++;
            cur = cur.next;
        }

        cur = vHead;

        for(int i = 0; i < size - n; i++){
            cur = cur.next;
        }

        cur.next = cur.next.next;

        return vHead.next;
    }
}
