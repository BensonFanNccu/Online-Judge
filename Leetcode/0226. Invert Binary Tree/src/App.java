public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, invert the tree, and return its root.
         * 
         * Example:
         * Input: root = [4,2,7,1,3,6,9]
         * Output: [4,7,2,9,6,3,1]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {4, 2, 7, 1, 3, 6, 9}, 0);

        sol.invertTree(case1);
        case1.printTree();
    }
}
