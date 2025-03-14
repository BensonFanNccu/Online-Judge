public class App {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();

        ListNode case1 = new ListNode(new int[] {3, 2, 0, -4});
        ListNode case2 = new ListNode(new int[] {1, 2});
        ListNode case3 = new ListNode(new int[] {1});

        case1.addCycle();
        case2.addCycle();

        System.out.println(sol.hasCycle(case1));
        System.out.println(sol.hasCycle(case2));
        System.out.println(sol.hasCycle(case3));
    }
}
