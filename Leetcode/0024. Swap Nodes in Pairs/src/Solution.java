public class Solution {
    public ListNode swapPairs(ListNode head){
        /*
         * Iterative Solution
         * Time: O(N)
         * Space: O(1)
         */

        ListNode vHead = new ListNode(0), cur = null, tem1 = null, tem2;

        vHead.next = head;
        cur = vHead;

        while(cur.next != null && cur.next.next != null){
            tem1 = cur.next;
            tem2 = cur.next.next;

            cur.next = tem2;
            tem1.next = tem2.next;
            tem2.next = tem1;
            cur = cur.next.next;
        }

        return vHead.next;
    }


    public ListNode swapPairs2(ListNode head){
        /*
         * Recursive Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        if(head == null || head.next == null) return head;

        ListNode next = head.next;
        ListNode newNode = swapPairs(next.next);

        next.next = head;
        head.next = newNode;

        return next;
    }
}
