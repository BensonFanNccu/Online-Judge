public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a linked list, swap every two adjacent nodes and return its head. 
         * You must solve the problem without modifying the values 
         * in the list's nodes (i.e., only nodes themselves may be changed.)
         * 
         * Example:
         * Input: head = [1,2,3,4]
         * Output: [2,1,4,3]
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 2, 3, 4});

        sol.swapPairs(case1).printNodes();
    }
}
