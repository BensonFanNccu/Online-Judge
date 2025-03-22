public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, 
         * return an array of the largest value in each row of the tree (0-indexed).
         * 
         * Example:
         * Input: root = [1,3,2,5,3,null,9]
         * Output: [1,3,9]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 15, 7}, 0);

        System.out.println(sol.largestValues(case1));
    }
}
