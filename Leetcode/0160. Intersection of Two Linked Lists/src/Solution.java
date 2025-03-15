public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        /*
         * Two Pointers Solution
         * Time: O(M+N)
         * Space: O(1)
         */
        
        ListNode curA = headA, curB = headB;
        int sizeA = 0, sizeB = 0, diff = 0;

        while(curA != null){
            sizeA++;
            curA = curA.next;
        }

        while(curB != null){
            sizeB++;
            curB = curB.next;
        }

        diff = sizeA - sizeB;
        curA = headA;
        curB = headB;
        
        if(diff > 0){
            while(diff > 0){
                curA = curA.next;
                diff--;
            } 
        }else{
            while(diff < 0){
                curB = curB.next;
                diff++;
            }
        }

        while(curA != null && curB != null){
            if(curA == curB) return curA;

            curA = curA.next;
            curB = curB.next;
        }

        return null;
    }
}
