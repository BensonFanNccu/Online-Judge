public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a sorted linked list, 
         * delete all duplicates such that each element appears only once. 
         * Return the linked list sorted as well.
         * 
         * Example:
         * Input: head = [1,1,2]
         * Output: [1,2]
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {1, 1, 2});
        ListNode case2 = new ListNode(new int[] {1, 1, 2, 3, 3});

        sol.deleteDuplicates(case1).printNodes();
        System.out.println();
        sol.deleteDuplicates(case2).printNodes();
    }
}
