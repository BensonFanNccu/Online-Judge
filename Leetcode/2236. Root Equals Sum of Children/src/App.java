public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given the root of a binary tree that consists of exactly 3 nodes: 
         * the root, its left child, and its right child.
         * 
         * Return true if the value of the root is equal to the sum of the values 
         * of its two children, or false otherwise.
         * 
         * Example:
         * Input: root = [10,4,6]
         * Output: true
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {10, 4, 6}, 0);
        TreeNode case2 = new TreeNode(new int[] {5, 3, 1}, 0);

        System.out.println(sol.checkTree(case1));
        System.out.println(sol.checkTree(case2));
    }
}
