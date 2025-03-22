public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, return the level order traversal 
         * of its nodes' values. (i.e., from left to right, level by level).
         * 
         * Example:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: [[3],[9,20],[15,7]]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 15, 7}, 0);

        System.out.println(sol.levelOrder(case1));
    }
}
