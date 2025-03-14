public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a singly linked list, return the middle node of the linked list.
         * If there are two middle nodes, return the second middle node.
         * 
         * Example:
         * Input: head = [1,2,3,4,5]
         * Output: [3,4,5]
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 2, 3, 4, 5});
        ListNode case2 = new ListNode(new int[] {1, 2, 3, 4, 5, 6});

        sol.middleNode(case1).printNodes();
        System.out.println();

        sol.middleNode2(case2).printNodes();
        System.out.println();
    }
}
