public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a binary tree, find its minimum depth.
         * 
         * The minimum depth is the number of nodes along the shortest path from 
         * the root node down to the nearest leaf node.
         * 
         * Note: A leaf is a node with no children.
         * 
         * Example:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: 2
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);

        System.out.println(sol.minDepth(case1));
    }
}
