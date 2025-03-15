public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the heads of two singly linked-lists headA and headB, 
         * return the node at which the two lists intersect. 
         * If the two linked lists have no intersection at all, return null.
         * 
         * Example:
         * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
         * Output: Intersected at '8'
         */
        
        Solution sol = new Solution();

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3);
        ListNode intersect = new ListNode(new int[] {6, 7, 8, 9});

        a.next = intersect;
        b.next = intersect;

        System.out.println(sol.getIntersectionNode(a, b).val);
    }
}
