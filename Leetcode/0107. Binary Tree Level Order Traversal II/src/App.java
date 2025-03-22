public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, return the bottom-up level order traversal 
         * of its nodes' values. (i.e., from left to right, level by level from leaf to root).
         * 
         * Example:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: [[15,7],[9,20],[3]]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 15, 7}, 0);

        System.out.println(sol.levelOrderBottom(case1));
    }
}
