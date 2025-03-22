public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, 
         * return the average value of the nodes on each level in the form of an array. 
         * Answers within 10-5 of the actual answer will be accepted.
         * 
         * Example:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: [3.00000,14.50000,11.00000]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 15, 7}, 0);

        System.out.println(sol.averageOfLevels(case1));
    }
}
