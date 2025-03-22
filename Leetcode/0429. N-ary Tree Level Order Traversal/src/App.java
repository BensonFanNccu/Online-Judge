public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an n-ary tree, return the level order traversal of its nodes' values.
         * 
         * Nary-Tree input serialization is represented in their level order traversal, 
         * each group of children is separated by the null value.
         * 
         * Example:
         * Input: root = [1,null,3,2,4,null,5,6]
         * Output: [[1],[3,2,4],[5,6]]
         */
        
        Solution sol = new Solution();

        Node case1 = new Node(1);

        case1.children.add(new Node(2));
        case1.children.add(new Node(3));
        case1.children.add(new Node(4));

        System.out.println(sol.levelOrder(case1));
    }
}
