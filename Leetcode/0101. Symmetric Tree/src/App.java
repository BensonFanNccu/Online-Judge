public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, 
         * check whether it is a mirror of itself (i.e., symmetric around its center).
         * 
         * Example:
         * Input: root = [1,2,2,3,4,4,3]
         * Output: true
         */

        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {1, 2, 3}, 0);
        TreeNode case2 = new TreeNode(new int[] {1, 2, 2, 3, 3, 3, 3}, 0);

        System.out.println(sol.isSymmetric(case1));
        System.out.println(sol.isSymmetric(case2));
    }
}
