public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the head of a linked list, return the node where the cycle begins. 
         * If there is no cycle, return null.
         * 
         * There is a cycle in a linked list if there is some node in the list that can be 
         * reached again by continuously following the next pointer. 
         * Internally, pos is used to denote the index of the node that tail's next pointer 
         * is connected to (0-indexed). It is -1 if there is no cycle. 
         * Note that pos is not passed as a parameter.
         * 
         * Do not modify the linked list.
         * 
         * Example:
         * Input: head = [3,2,0,-4], pos = 1
         * Output: tail connects to node index 1
         */
        
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {3, 2, 0, -4});
        ListNode case2 = new ListNode(new int[] {1, 2});

        case1.addCycle();
        case2.addCycle();

        System.out.println(sol.detectCycle(case1).val);
        System.out.println(sol.detectCycle(case2).val);
    }
}
