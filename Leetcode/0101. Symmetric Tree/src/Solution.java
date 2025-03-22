public class Solution {
    public boolean isSymmetric(TreeNode root){
        /*
         * DFS Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        if(root == null) return true;

        return symmetric(root.left, root.right);
    }

    public boolean symmetric(TreeNode left, TreeNode right){
        if(left != null && right == null) return false;
        else if(left == null && right != null) return false;
        else if(left == null && right == null) return true;
        else if(left.val != right.val) return false;

        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }
}
