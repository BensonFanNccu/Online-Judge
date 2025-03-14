public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the roots of two binary trees p and q, 
         * write a function to check if they are the same or not.
         * 
         * Two binary trees are considered the same if they are structurally identical, 
         * and the nodes have the same value.
         * 
         * Example:
         * Input: p = [1,2,3], q = [1,2,3]
         * Output: true
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {1, 2, 3}, 0);
        TreeNode case2 = new TreeNode(new int[] {1, 2, 3}, 0);
        TreeNode case3 = new TreeNode(new int[] {1, 2, 3}, 0);
        TreeNode case4 = new TreeNode(new int[] {1, 1, 3}, 0);

        System.out.println(sol.isSameTree(case1, case2));
        System.out.println(sol.isSameTree(case3, case4));
    }
}
