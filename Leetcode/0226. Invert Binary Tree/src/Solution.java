public class Solution {
    public TreeNode invertTree(TreeNode root){
        /*
         * Recursion Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        if(root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
