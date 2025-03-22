public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given the root of a binary tree, imagine yourself standing on 
         * the right side of it, return the values of the nodes 
         * you can see ordered from top to bottom.
         * 
         * Example:
         * Input: root = [1,2,3,null,5,null,4]
         * Output: [1,3,4]
         */
        
        Solution sol = new Solution();

        TreeNode case1 = new TreeNode(new int[] {3, 9, 20, 15, 7}, 0);

        System.out.println(sol.rightSideView(case1));
    }
}
