public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, return the inorder traversal of its nodes' values.
         * 
         * Example:
         * Input: root = [1,null,2,3]
         * Output: [1,3,2]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {1, 2, 3}, 0);

        System.out.println(sol.inorderTraversal(case1));
    }
}
