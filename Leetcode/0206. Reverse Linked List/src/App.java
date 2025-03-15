public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a singly linked list, reverse the list, and return the reversed list.\
         * 
         * Example:
         * Input: head = [1,2,3,4,5]
         * Output: [5,4,3,2,1]
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 2, 3, 4, 5});

        sol.reverseList(case1).printNodes();
    }
}
