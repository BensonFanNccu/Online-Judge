public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
         * 
         * A valid BST is defined as follows:
         * 1. The left subtree of a node contains only nodes with keys less than the node's key.
         * 2. The right subtree of a node contains only nodes with keys greater than the node's key.
         * 3. Both the left and right subtrees must also be binary search trees.
         * 
         * Example:
         * Input: root = [5,1,4,null,null,3,6]
         * Output: false
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[]{2, 1, 3}, 0);
        TreeNode case2 = new TreeNode(new int[]{5, 1, 4, 7, 8, 3, 6}, 0);

        System.out.println(sol.isValidBST(case1));
        System.out.println(sol.isValidBST(case2));
    }
}
