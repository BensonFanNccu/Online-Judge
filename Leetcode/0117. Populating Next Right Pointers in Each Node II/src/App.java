public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a binary tree
         * 
         * Populate each next pointer to point to its next right node. 
         * If there is no next right node, the next pointer should be set to NULL.
         * 
         * Initially, all next pointers are set to NULL.
         * 
         * Example:
         * Input: root = [1,2,3,4,5,null,7]
         * Output: [1,#,2,3,#,4,5,7,#]
         */
        
        Solution sol = new Solution();

        Node case1 = new Node(1);

        case1.left = new Node(2);
        case1.left = new Node(3);

        sol.connect(case1);
    }
}
