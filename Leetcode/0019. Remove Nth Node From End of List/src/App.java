public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a linked list, 
         * remove the nth node from the end of the list and return its head.
         * 
         * Example:
         * Input: head = [1,2,3,4,5], n = 2
         * Output: [1,2,3,5]
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 2, 3, 4, 5});

        sol.removeNthFromEnd(case1, 2).printNodes();
    }
}
