public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a linked list and an integer val, 
         * remove all the nodes of the linked list that has Node.val == val, 
         * and return the new head.
         * 
         * Example:
         * Input: head = [1,2,6,3,4,5,6], val = 6
         * Output: [1,2,3,4,5]
         */

        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 2, 6, 3, 4, 5, 6});

        sol.removeElements(case1, 6).printNodes();
    }
}
