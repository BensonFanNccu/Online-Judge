public class Solution {
    public ListNode middleNode(ListNode head){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(1)
         */

        int counter = 0;
        ListNode cur = head;

        while(cur != null){
            counter++;
            cur = cur.next;
        }

        counter /= 2;

        while(counter > 0){
            counter--;
            head = head.next;
        }

        return head;
    }
    

    public ListNode middleNode2(ListNode head){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
