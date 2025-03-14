public class App {
    public static void main(String[] args) throws Exception {
        /*
         * The thief has found himself a new place for his thievery again. 
         * There is only one entrance to this area, called root.
         * 
         * Besides the root, each house has one and only one parent house. 
         * After a tour, the smart thief realized that all houses in this place form a binary tree. 
         * It will automatically contact the police if two directly-linked houses were 
         * broken into on the same night.
         * 
         * Given the root of the binary tree, return the maximum amount of money 
         * the thief can rob without alerting the police.
         * 
         * Example:
         * Input: root = [3,2,3,null,3,null,1]
         * Output: 7
         * Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
         */

        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 2, 3, 0, 3, 0, 1}, 0);
        TreeNode case2 = new TreeNode(new int[] {3, 4, 5, 1, 3, 0, 1}, 0);

        System.out.println(sol.rob(case1));
        System.out.println(sol.rob(case2));
    }
}
