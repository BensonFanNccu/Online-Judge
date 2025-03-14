public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, return its maximum depth.
         * 
         * A binary tree's maximum depth is the number of nodes 
         * along the longest path from the root node down to the farthest leaf node.
         * 
         * Input: root = [3,9,20,null,null,15,7]
         * Output: 3
         */

        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 4, 5, 15, 7}, 0);
        TreeNode case2 = new TreeNode(new int[] {1, 2, 3}, 0);

        System.out.println(sol.maxDepth(case1));
        System.out.println(sol.maxDepth(case2));
    }
}
